package model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import javafx.scene.layout.Pane;
import lombok.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@Data
public class Model {
    /**
     * list of levels that can be played.
     */
    List<Level> levels;
    /**
     * list of saves that contain the record of each level.
     */
    List<Save> saves;
    /**
     * the number of the current level
     */
    int levelNumber;
    private static Logger logger = LoggerFactory.getLogger(Model.class);

    public Model() {
        logger.info("constructing Model");
        this.levelNumber = 0;
        this.levels = levelFileReader();
        this.saves = saveFileReader();
        levels.get(levelNumber).newCharMap();
    }

    /**
     * Method reads in a list of Levels from a json file.
     * @return a list of Levels
     */
    public List<Level> levelFileReader(){
        logger.info("reading level file");
        Gson gson = new GsonBuilder().create();
        Reader reader = new InputStreamReader(getClass().getResourceAsStream("/json/levels.json"));
        Type type = new TypeToken<List<Level>>(){}.getType();
        List<Level>levels = gson.fromJson(reader, type);
        return levels;

    }

    /**
     * Method reads in a list of Saves from a json file, if no save file is found
     * it creates a new list.
     * @return list of Saves from a json file, if no save file is found
     * it creates a new list and returns it.
     */
    public List<Save> saveFileReader(){
        logger.info("trying to read save file");
        List<Save> saves = new ArrayList<>();
        try {
            Gson gson = new GsonBuilder().create();
            Reader reader = null;
            reader = new FileReader("~/sokoban/save.json");
            Type type = new TypeToken<List<Save>>(){}.getType();
            saves = gson.fromJson(reader, type);
            logger.info("save file successfully red");
        } catch (FileNotFoundException e) {
            logger.info("no save file found, creating new save");
            Save newSave = new Save(levelNumber);
            saves.add(newSave);
        }
        return saves;
    }

    /**
     * Method try's to overwrite a list of saves into a file. If the file
     * does not exist it creates it.
     */
    public void saveFileWriter(){
        logger.info("trying to save");
        try {
            File file = new File("~/sokoban/save.json");
            File parent = file.getParentFile();
            if (!parent.exists() && !parent.mkdirs()) {
                throw new IllegalStateException("Couldn't create dir: " + parent);
            }
            file.createNewFile();
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            Writer writer = new FileWriter(file);

            Type type = new TypeToken<List<Save>>() {
            }.getType();
            String json = gson.toJson(saves, type);

            writer.write(json);
            writer.close();
            logger.info("file successfully saved");
        } catch (IOException e) {
            logger.error("couldn't write save file");
            e.printStackTrace();
        }

    }

    /**
     * Method for getting the {@code levelNumber} of the next element of the {@code levels} list, if there is one.
     * @return the {@code levelNumber} of the next element of the {@code levels} list, if there is one.
     */
    public String nextLevel(){
        logger.info("getting next levelNumber");
        if (levelNumber < levels.size()-1) return Integer.toString(levelNumber+ 1);
        return Integer.toString(levelNumber);
    }

    /**
     * Method for getting the {@code levelNumber} of the previous element of the {@code levels} list, if there is one.
     * @return the {@code levelNumber} of the previous element of the {@code levels} list, if there is one.
     */
    public String previousLevel(){
        logger.info("getting previous levelNumber");
        if (levelNumber > 0) return Integer.toString(levelNumber - 1);
        return Integer.toString(levelNumber);
    }

    /**
     * Method for setting up a new level and deleting the used {@code charMap} of the previous level.
     * @param newLevelNumberString the {@code levelNumber} of the new level.
     */
    public void setNewLevel(String newLevelNumberString){
        logger.info("setting up next level");
        int newLevelNumberInt = Integer.parseInt(newLevelNumberString);
        setLevelNumber(newLevelNumberInt);
        levels.get(levelNumber).deleteCharMap();
        levels.get(levelNumber).setStep(0);
        levels.get(newLevelNumberInt).newCharMap();
    }

    /**
     * Method for getting the best scale with which can be used to draw the level to the pane.
     * @param pane the pane which is used to the drawing.
     * @return the integer value that represents the best scale with which can be used
     * to draw the level to the pane.
     */
    public int getScale(Pane pane){
        logger.info("getting scale of game pane");
        int scale;
        double dispHeight = pane.getHeight();
        double dispWidth = pane.getWidth();

        if (dispHeight == 0){
            dispHeight = pane.getPrefHeight();
        }
        if (dispWidth == 0){
            dispWidth = pane.getPrefWidth();
        }

        int levelHeight = getLevel().getHeight();
        int levelWidth = getLevel().getWidth();

        if (dispHeight/levelHeight < dispWidth/levelWidth){
            scale = (int) (dispHeight / levelHeight);
        }
        else {
            scale = (int) (dispWidth / levelWidth);
        }
        return scale;

    }

    /**
     * Returns the Level corresponding to the {@code levelNumber} index.
     * @return the Level corresponding to the {@code levelNumber} index.
     */
    public Level getLevel(){
        return levels.get(levelNumber);
    }

    /**
     * Returns the Save corresponding to the {@code levelNumber} index,
     * if there is no such then it creates and returns a new empty Save.
     * @return the Save corresponding to the {@code levelNumber} index,
     * if there is no such then it creates and returns a new empty Save.
     */
    public Save getSave(){
        logger.info("trying to get save of level {}", levelNumber);
        if (!saves.isEmpty()) {
            for (Save save : saves) {
                if (save.getLevelNumber() == levelNumber) {

                    return save;
                }
            }
        }
        logger.info("no save found, making a new one");
        Save newSave = new Save(levelNumber);
        saves.add(newSave);
        return newSave;
    }

    /**
     * Method for clearing out the {@code saves} list.
     */
    public void deleteSaves(){
        logger.info("deleting saves");
        saves.clear();
    }






}


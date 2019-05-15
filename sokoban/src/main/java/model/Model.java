package model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import javafx.scene.layout.Pane;
import lombok.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@Data
public class Model {
    List<Level> levels;
    List<Save> saves;
    int levelNumber;
    private static Logger logger = LoggerFactory.getLogger(Model.class);


    public Model() {
        logger.info("constructing Model");
        this.levelNumber = 0;
        this.levels = levelFileReader();
        this.saves = saveFileReader();
        levels.get(levelNumber).newCharMap();
    }

    public List<Level> levelFileReader(){
        logger.info("reading level file");
        Gson gson = new GsonBuilder().create();
        Reader reader = new InputStreamReader(getClass().getResourceAsStream("/json/levels.json"));
        Type type = new TypeToken<List<Level>>(){}.getType();
        List<Level>levels = gson.fromJson(reader, type);
        return levels;

    }

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

    public String nextLevel(String level){
        logger.info("geting next level");
        int integer = Integer.parseInt(level);
        if (integer < levels.size()) return Integer.toString(integer + 1);
        return level;
    }

    public String previousLevel(String level){
        logger.info("geting previous level");
        int integer = Integer.parseInt(level);
        if (integer > 0) return Integer.toString(integer - 1);
        return level;
    }

    public void setNewLevel(String newLevelNumberString){
        logger.info("setting up next level");
        int newLevelNumberInt = Integer.parseInt(newLevelNumberString);
        setLevelNumber(newLevelNumberInt);
        levels.get(levelNumber).deletCharMap();
        levels.get(levelNumber).setStep(0);
        levels.get(newLevelNumberInt).newCharMap();
    }


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

    public Level getLevel(){
        return levels.get(levelNumber);
    }

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


    public void deleteSaves(){
        logger.info("deleting saves");
        saves.clear();
    }






}


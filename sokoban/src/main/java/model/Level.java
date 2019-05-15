package model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a level of the game.
 */
@Data
public class Level {
    /**
     * Name of the level.
     */
    String name;
    /**
     * Width of the level's map.
     */
    int width;
    /**
     * Height of the level's map.
     */
    int height;
    /**
     * List of {@code String} representing the original map of the level.
     *
     */
    List<String> stringMap;
    /**
     * List of {@code Character} lists, representing altered map the level.
     */
    List<List<Character>> charMap;
    /**
     * Position representing the players coordinates on the {@code charMap}.
     */
    Position playerPosition = new Position();
    /**
     * Integer representing the number of steps the Player has made on the level.
     */
    int step;

    private static Logger logger = LoggerFactory.getLogger(Model.class);



    /**
     * Method  for creating a new {@code charMap} from {@code stringMap}.
     *
     */
    public void newCharMap(){
        logger.info("making new charmap");
        charMap = new ArrayList<>();
        for (int i = 0; i < stringMap.size(); i++) {
            List<Character> characters = new ArrayList<>();
            for (int j = 0; j < stringMap.get(i).length(); j++) {
                characters.add(stringMap.get(i).charAt(j));
            }
            charMap.add(characters);
        }
    }

    /**
     * Method for moving the Player and the Crates on the map. Modifies the
     * {@code playerPosition} and the {@code charMap}.
     * @param i represents how much the player wants to move on the first coordinates.
     * @param j represents how much the player wants to move on the second coordinates.
     */
    public void move(int i, int j) {
        logger.info("trjing to move to [{}] [{}]", i, j);
        playerPosition.setPosition(charMap);
        int h = playerPosition.h;
        int w = playerPosition.w;

        if (charMap.get(h).get(w) == '@'){
            if (charMap.get(h+i).get(w+j) == ' '){charMap.get(h).set(w,' '); charMap.get(h+i).set(w+j,'@'); addStep(); logger.info("moved");}
            else if (charMap.get(h+i).get(w+j) == '.'){charMap.get(h).set(w,' '); charMap.get(h+i).set(w+j,'+'); addStep(); logger.info("moved");}
            else if (charMap.get(h+i).get(w+j) == '$'){
                if (charMap.get(h+2*i).get(w+2*j) == ' '){charMap.get(h).set(w,' '); charMap.get(h+i).set(w+j,'@'); charMap.get(h+2*i).set(w+2*j,'$'); addStep(); logger.info("moved");}
                else if (charMap.get(h+2*i).get(w+2*j) == '.'){charMap.get(h).set(w,' '); charMap.get(h+i).set(w+j,'@'); charMap.get(h+2*i).set(w+2*j,'*'); addStep(); logger.info("moved");}
            }
            else if (charMap.get(h+i).get(w+j) == '*'){
                if (charMap.get(h+2*i).get(w+2*j) == ' '){charMap.get(h).set(w,' '); charMap.get(h+i).set(w+j,'+'); charMap.get(h+2*i).set(w+2*j,'$'); addStep(); logger.info("moved");}
                else if (charMap.get(h+2*i).get(w+2*j) == '.'){charMap.get(h).set(w,' '); charMap.get(h+i).set(w+j,'+'); charMap.get(h+2*i).set(w+2*j,'*'); addStep(); logger.info("moved");}
            }
        }
        else if (charMap.get(h).get(w) == '+'){
            if (charMap.get(h+i).get(w+j) == ' '){charMap.get(h).set(w,'.'); charMap.get(h+i).set(w+j,'@'); addStep(); logger.info("moved");}
            else if (charMap.get(h+i).get(w+j) == '.'){charMap.get(h).set(w,'.'); charMap.get(h+i).set(w+j,'+'); addStep(); logger.info("moved");}
            else if (charMap.get(h+i).get(w+j) == '$'){
                if (charMap.get(h+2*i).get(w+2*j) == ' '){charMap.get(h).set(w,'.'); charMap.get(h+i).set(w+j,'@'); charMap.get(h+2*i).set(w+2*j,'$'); addStep(); logger.info("moved");}
                else if (charMap.get(h+2*i).get(w+2*j) == '.'){charMap.get(h).set(w,'.'); charMap.get(h+i).set(w+j,'@'); charMap.get(h+2*i).set(w+2*j,'*'); addStep(); logger.info("moved");}
            }
            else if (charMap.get(h+i).get(w+j) == '*'){
                if (charMap.get(h+2*i).get(w+2*j) == ' '){charMap.get(h).set(w,'.'); charMap.get(h+i).set(w+j,'+'); charMap.get(h+2*i).set(w+2*j,'$'); addStep(); logger.info("moved");}
                else if (charMap.get(h+2*i).get(w+2*j) == '.'){charMap.get(h).set(w,'.'); charMap.get(h+i).set(w+j,'+'); charMap.get(h+2*i).set(w+2*j,'*'); addStep(); logger.info("moved");}
            }
        }
    }

    /**
     * Method for checking if a level is over.
     * @return true if no finish blocks are free ({@literal "."}) and the player does not stay on a finish block ({@literal "+"}).
     */
    public boolean isLevelOver(){
        boolean isOver = true;
        for (List<Character> list: charMap) {
            for (Character character: list) {
                if (character.equals('.') || character.equals('+')) isOver = false;
            }
        }
        return isOver;
    }

    /**
     * Method fpr deleting unnecessary {@code charMap}.
     */
    public void deleteCharMap(){
        this.charMap = null;
    }

    /**
     * Method for adding one to the {@code step}.
     */
    public void addStep(){
        step++;
    }

    /**
     * Method for getting the {@code step} integer as a {@code String}.
     * @return {@code step} as a string.
     */
    public String getStepToString(){
        return Integer.toString(step);
    }

}


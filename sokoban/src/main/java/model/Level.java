package model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

@Data
public class Level {
    String name;
    int width;
    int height;
    List<String> stringMap;
    List<List<Character>> charMap;
    Position playerPosition;
    int step;

    private static Logger logger = LoggerFactory.getLogger(Model.class);



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
        playerPosition = new Position();
    }

    public void move(int x, int y) {
        logger.info("trying to move to [{}] [{}]", x, y);
        playerPosition.setPosition(charMap);
        int h = playerPosition.h;
        int w = playerPosition.w;

        if (charMap.get(h).get(w) == '@'){
            if (charMap.get(h+x).get(w+y) == ' '){charMap.get(h).set(w,' '); charMap.get(h+x).set(w+y,'@'); addStep(); logger.info("moved");}
            else if (charMap.get(h+x).get(w+y) == '.'){charMap.get(h).set(w,' '); charMap.get(h+x).set(w+y,'+'); addStep(); logger.info("moved");}
            else if (charMap.get(h+x).get(w+y) == '$'){
                if (charMap.get(h+2*x).get(w+2*y) == ' '){charMap.get(h).set(w,' '); charMap.get(h+x).set(w+y,'@'); charMap.get(h+2*x).set(w+2*y,'$'); addStep(); logger.info("moved");}
                else if (charMap.get(h+2*x).get(w+2*y) == '.'){charMap.get(h).set(w,' '); charMap.get(h+x).set(w+y,'@'); charMap.get(h+2*x).set(w+2*y,'*'); addStep(); logger.info("moved");}
            }
            else if (charMap.get(h+x).get(w+y) == '*'){
                if (charMap.get(h+2*x).get(w+2*y) == ' '){charMap.get(h).set(w,' '); charMap.get(h+x).set(w+y,'+'); charMap.get(h+2*x).set(w+2*y,'$'); addStep(); logger.info("moved");}
                else if (charMap.get(h+2*x).get(w+2*y) == '.'){charMap.get(h).set(w,' '); charMap.get(h+x).set(w+y,'+'); charMap.get(h+2*x).set(w+2*y,'*'); addStep(); logger.info("moved");}
            }
        }
        else if (charMap.get(h).get(w) == '+'){
            if (charMap.get(h+x).get(w+y) == ' '){charMap.get(h).set(w,'.'); charMap.get(h+x).set(w+y,'@'); addStep(); logger.info("moved");}
            else if (charMap.get(h+x).get(w+y) == '.'){charMap.get(h).set(w,'.'); charMap.get(h+x).set(w+y,'+'); addStep(); logger.info("moved");}
            else if (charMap.get(h+x).get(w+y) == '$'){
                if (charMap.get(h+2*x).get(w+2*y) == ' '){charMap.get(h).set(w,'.'); charMap.get(h+x).set(w+y,'@'); charMap.get(h+2*x).set(w+2*y,'$'); addStep(); logger.info("moved");}
                else if (charMap.get(h+2*x).get(w+2*y) == '.'){charMap.get(h).set(w,'.'); charMap.get(h+x).set(w+y,'@'); charMap.get(h+2*x).set(w+2*y,'*'); addStep(); logger.info("moved");}
            }
            else if (charMap.get(h+x).get(w+y) == '*'){
                if (charMap.get(h+2*x).get(w+2*y) == ' '){charMap.get(h).set(w,'.'); charMap.get(h+x).set(w+y,'+'); charMap.get(h+2*x).set(w+2*y,'$'); addStep(); logger.info("moved");}
                else if (charMap.get(h+2*x).get(w+2*y) == '.'){charMap.get(h).set(w,'.'); charMap.get(h+x).set(w+y,'+'); charMap.get(h+2*x).set(w+2*y,'*'); addStep(); logger.info("moved");}
            }
        }
    }

    public boolean isLevelOver(){
        boolean isOver = true;
        for (List<Character> list: charMap) {
            for (Character character: list) {
                if (character.equals('.') || character.equals('+')) isOver = false;
            }
        }
        return isOver;
    }

    public void deletCharMap(){
        this.charMap = null;
    }

    public void addStep(){
        step++;
    }

    public String getStepToString(){
        return Integer.toString(step);
    }

}


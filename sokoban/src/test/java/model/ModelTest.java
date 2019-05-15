package model;

import javafx.scene.layout.Pane;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ModelTest {

    @Test
    void nextLevel() {
        Model model = new Model();
        List<Level> levels = new ArrayList<>();
        Level level1 = new Level();
        Level level2 = new Level();
        Level level3 = new Level();
        levels.add(level1);
        levels.add(level2);
        levels.add(level3);
        model.setLevels(levels);
        model.setLevelNumber(0);
        assertEquals(model.nextLevel(), "1");
        model.setLevelNumber(2);
        assertEquals(model.nextLevel(), "2");
    }

    @Test
    void previousLevel() {
        Model model = new Model();
        List<Level> levels = new ArrayList<>();
        Level level1 = new Level();
        Level level2 = new Level();
        Level level3 = new Level();
        levels.add(level1);
        levels.add(level2);
        levels.add(level3);
        model.setLevels(levels);
        model.setLevelNumber(2);
        assertEquals(model.previousLevel(), "1");
        model.setLevelNumber(0);
        assertEquals(model.previousLevel(), "0");
    }

    @Test
    void getLevel() {
        Model model = new Model();
        List<Level> levels = new ArrayList<>();
        Level level1 = new Level();
        Level level2 = new Level();
        Level level3 = new Level();
        levels.add(level1);
        levels.add(level2);
        levels.add(level3);
        model.setLevels(levels);
        model.setLevelNumber(1);
        assertEquals(model.getLevel(), level2);
    }

    @Test
    void getSave() {
        Model model = new Model();
        List<Save> saves = new ArrayList<>();
        Save save1 = new Save();
        save1.setLevelNumber(1);
        Save save2 = new Save();
        save2.setLevelNumber(2);
        Save save3 = new Save();
        save3.setLevelNumber(3);
        saves.add(save1);
        saves.add(save2);
        saves.add(save3);
        model.setSaves(saves);

        model.setLevelNumber(2);
        assertEquals(model.getSave(), save2);
        model.setLevelNumber(5);
        assertEquals(model.getSave(), new Save(5));

    }

    @Test
    void deleteSaves() {
        Model model = new Model();
        List<Save> saves = new ArrayList<>();
        Save save1 = new Save();
        Save save2 = new Save();
        Save save3 = new Save();
        saves.add(save1);
        saves.add(save2);
        saves.add(save3);
        model.setSaves(saves);
        assertEquals(model.saves.size(), 3);
        model.deleteSaves();
        assertEquals(model.saves.size(), 0);
    }
}
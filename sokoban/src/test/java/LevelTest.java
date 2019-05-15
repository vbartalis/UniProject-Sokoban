import model.Level;
import model.Position;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LevelTest {
    @Test
    void testNewCharMAp() {
        List<String> testStringMap = new ArrayList<>();
        List<List<Character>> testCharMap = new ArrayList<>();

        testStringMap.add("######");
        testStringMap.add("# .  #");
        testStringMap.add("# @$ #");
        testStringMap.add("# *  #");
        testStringMap.add("######");

        testCharMap.add(Arrays.asList('#','#','#','#','#','#'));
        testCharMap.add(Arrays.asList('#',' ','.',' ',' ','#'));
        testCharMap.add(Arrays.asList('#',' ','@','$',' ','#'));
        testCharMap.add(Arrays.asList('#',' ','*',' ',' ','#'));
        testCharMap.add(Arrays.asList('#','#','#','#','#','#'));

        Level testLevel = new Level();
        testLevel.setStringMap(testStringMap);
        testLevel.newCharMap();

        assertEquals(testCharMap, testLevel.getCharMap());
    }

    @Test
    void testMoveUp1() {
        List<List<Character>> expectedCharMap1 = new ArrayList<>();
        expectedCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        expectedCharMap1.add(Arrays.asList('#',' ','+',' ',' ','#'));
        expectedCharMap1.add(Arrays.asList('#',' ',' ','$',' ','#'));
        expectedCharMap1.add(Arrays.asList('#',' ','*',' ',' ','#'));
        expectedCharMap1.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        expectedCharMap1.add(Arrays.asList('#','#','#','#','#','#'));

        List<List<Character>> expectedCharMap2 = new ArrayList<>();
        expectedCharMap2.add(Arrays.asList('#','#','#','#','#','#'));
        expectedCharMap2.add(Arrays.asList('#',' ','.',' ',' ','#'));
        expectedCharMap2.add(Arrays.asList('#','@',' ','$',' ','#'));
        expectedCharMap2.add(Arrays.asList('#',' ','*',' ',' ','#'));
        expectedCharMap2.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        expectedCharMap2.add(Arrays.asList('#','#','#','#','#','#'));

        List<List<Character>> expectedCharMap31 = new ArrayList<>();
        expectedCharMap31.add(Arrays.asList('#','#','#','#','#','#'));
        expectedCharMap31.add(Arrays.asList('#',' ','.',' ',' ','#'));
        expectedCharMap31.add(Arrays.asList('#',' ',' ','$',' ','#'));
        expectedCharMap31.add(Arrays.asList('#',' ','+',' ',' ','#'));
        expectedCharMap31.add(Arrays.asList('#',' ','$',' ',' ','#'));
        expectedCharMap31.add(Arrays.asList('#','#','#','#','#','#'));

        List<List<Character>> expectedCharMap32 = new ArrayList<>();
        expectedCharMap32.add(Arrays.asList('#','#','#','#','#','#'));
        expectedCharMap32.add(Arrays.asList('#',' ','.',' ',' ','#'));
        expectedCharMap32.add(Arrays.asList('#',' ',' ','$','.','#'));
        expectedCharMap32.add(Arrays.asList('#',' ','+',' ',' ','#'));
        expectedCharMap32.add(Arrays.asList('#',' ','*',' ',' ','#'));
        expectedCharMap32.add(Arrays.asList('#','#','#','#','#','#'));

        List<List<Character>> expectedCharMap41 = new ArrayList<>();
        expectedCharMap41.add(Arrays.asList('#','#','#','#','#','#'));
        expectedCharMap41.add(Arrays.asList('#',' ','.',' ',' ','#'));
        expectedCharMap41.add(Arrays.asList('#',' ',' ','@','$','#'));
        expectedCharMap41.add(Arrays.asList('#',' ','*',' ',' ','#'));
        expectedCharMap41.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        expectedCharMap41.add(Arrays.asList('#','#','#','#','#','#'));

        List<List<Character>> expectedCharMap42 = new ArrayList<>();
        expectedCharMap42.add(Arrays.asList('#','#','#','#','#','#'));
        expectedCharMap42.add(Arrays.asList('#',' ','.',' ',' ','#'));
        expectedCharMap42.add(Arrays.asList('#',' ',' ','@','*','#'));
        expectedCharMap42.add(Arrays.asList('#',' ','*',' ',' ','#'));
        expectedCharMap42.add(Arrays.asList('#',' ','.',' ',' ','#'));
        expectedCharMap42.add(Arrays.asList('#','#','#','#','#','#'));

        List<List<Character>> testCharMap1 = new ArrayList<>();
        testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        testCharMap1.add(Arrays.asList('#',' ','.',' ',' ','#'));
        testCharMap1.add(Arrays.asList('#',' ','@','$',' ','#'));
        testCharMap1.add(Arrays.asList('#',' ','*',' ',' ','#'));
        testCharMap1.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        Level testLevel = new Level();
        testLevel.setCharMap(testCharMap1);
        testLevel.setPlayerPosition(new Position(2,3));
        testLevel.move(-1,0);
        assertEquals(testLevel.getCharMap(), expectedCharMap1);

        testCharMap1 = new ArrayList<>();
        testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        testCharMap1.add(Arrays.asList('#',' ','.',' ',' ','#'));
        testCharMap1.add(Arrays.asList('#',' ','@','$',' ','#'));
        testCharMap1.add(Arrays.asList('#',' ','*',' ',' ','#'));
        testCharMap1.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        testLevel.setCharMap(testCharMap1);
        testLevel.setPlayerPosition(new Position(2,3));
        testLevel.move(0,-1);
        assertEquals(testLevel.getCharMap(), expectedCharMap2);

        testCharMap1 = new ArrayList<>();
        testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        testCharMap1.add(Arrays.asList('#',' ','.',' ',' ','#'));
        testCharMap1.add(Arrays.asList('#',' ','@','$',' ','#'));
        testCharMap1.add(Arrays.asList('#',' ','*',' ',' ','#'));
        testCharMap1.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        testLevel.setCharMap(testCharMap1);
        testLevel.setPlayerPosition(new Position(2,3));
        testLevel.move(1,0);
        assertEquals(testLevel.getCharMap(), expectedCharMap31);

        List<List<Character>> testCharMap2 = new ArrayList<>();
        testCharMap2.add(Arrays.asList('#','#','#','#','#','#'));
        testCharMap2.add(Arrays.asList('#',' ','.',' ',' ','#'));
        testCharMap2.add(Arrays.asList('#',' ','@','$','.','#'));
        testCharMap2.add(Arrays.asList('#',' ','*',' ',' ','#'));
        testCharMap2.add(Arrays.asList('#',' ','.',' ',' ','#'));
        testCharMap2.add(Arrays.asList('#','#','#','#','#','#'));
        testLevel.setCharMap(testCharMap2);
        testLevel.setPlayerPosition(new Position(2,3));
        testLevel.move(1,0);
        assertEquals(testLevel.getCharMap(), expectedCharMap32);

        testCharMap1 = new ArrayList<>();
        testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        testCharMap1.add(Arrays.asList('#',' ','.',' ',' ','#'));
        testCharMap1.add(Arrays.asList('#',' ','@','$',' ','#'));
        testCharMap1.add(Arrays.asList('#',' ','*',' ',' ','#'));
        testCharMap1.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        testLevel.setCharMap(testCharMap1);
        testLevel.setPlayerPosition(new Position(2,3));
        testLevel.move(0,1);
        assertEquals(testLevel.getCharMap(), expectedCharMap41);

        testCharMap2 = new ArrayList<>();
        testCharMap2.add(Arrays.asList('#','#','#','#','#','#'));
        testCharMap2.add(Arrays.asList('#',' ','.',' ',' ','#'));
        testCharMap2.add(Arrays.asList('#',' ','@','$','.','#'));
        testCharMap2.add(Arrays.asList('#',' ','*',' ',' ','#'));
        testCharMap2.add(Arrays.asList('#',' ','.',' ',' ','#'));
        testCharMap2.add(Arrays.asList('#','#','#','#','#','#'));
        testLevel.setCharMap(testCharMap2);
        testLevel.setPlayerPosition(new Position(2,3));
        testLevel.move(0,1);
        assertEquals(testLevel.getCharMap(), expectedCharMap42);
    }
    @Test
    void testMoveUp2() {
        Level testLevel = new Level();

        List<List<Character>> expectedCharMap1 = new ArrayList<>();
        expectedCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        expectedCharMap1.add(Arrays.asList('#',' ','+',' ',' ','#'));
        expectedCharMap1.add(Arrays.asList('#',' ','.','$',' ','#'));
        expectedCharMap1.add(Arrays.asList('#',' ','*',' ',' ','#'));
        expectedCharMap1.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        expectedCharMap1.add(Arrays.asList('#','#','#','#','#','#'));

        List<List<Character>> expectedCharMap2 = new ArrayList<>();
        expectedCharMap2.add(Arrays.asList('#','#','#','#','#','#'));
        expectedCharMap2.add(Arrays.asList('#',' ','.',' ',' ','#'));
        expectedCharMap2.add(Arrays.asList('#','@','.','$',' ','#'));
        expectedCharMap2.add(Arrays.asList('#',' ','*',' ',' ','#'));
        expectedCharMap2.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        expectedCharMap2.add(Arrays.asList('#','#','#','#','#','#'));

        List<List<Character>> expectedCharMap31 = new ArrayList<>();
        expectedCharMap31.add(Arrays.asList('#','#','#','#','#','#'));
        expectedCharMap31.add(Arrays.asList('#',' ','.',' ',' ','#'));
        expectedCharMap31.add(Arrays.asList('#',' ','.','$',' ','#'));
        expectedCharMap31.add(Arrays.asList('#',' ','+',' ',' ','#'));
        expectedCharMap31.add(Arrays.asList('#',' ','$',' ',' ','#'));
        expectedCharMap31.add(Arrays.asList('#','#','#','#','#','#'));

        List<List<Character>> expectedCharMap32 = new ArrayList<>();
        expectedCharMap32.add(Arrays.asList('#','#','#','#','#','#'));
        expectedCharMap32.add(Arrays.asList('#',' ','.',' ',' ','#'));
        expectedCharMap32.add(Arrays.asList('#',' ','.','$','.','#'));
        expectedCharMap32.add(Arrays.asList('#',' ','+',' ',' ','#'));
        expectedCharMap32.add(Arrays.asList('#',' ','*',' ',' ','#'));
        expectedCharMap32.add(Arrays.asList('#','#','#','#','#','#'));

        List<List<Character>> expectedCharMap41 = new ArrayList<>();
        expectedCharMap41.add(Arrays.asList('#','#','#','#','#','#'));
        expectedCharMap41.add(Arrays.asList('#',' ','.',' ',' ','#'));
        expectedCharMap41.add(Arrays.asList('#',' ','.','@','$','#'));
        expectedCharMap41.add(Arrays.asList('#',' ','*',' ',' ','#'));
        expectedCharMap41.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        expectedCharMap41.add(Arrays.asList('#','#','#','#','#','#'));

        List<List<Character>> expectedCharMap42 = new ArrayList<>();
        expectedCharMap42.add(Arrays.asList('#','#','#','#','#','#'));
        expectedCharMap42.add(Arrays.asList('#',' ','.',' ',' ','#'));
        expectedCharMap42.add(Arrays.asList('#',' ','.','@','*','#'));
        expectedCharMap42.add(Arrays.asList('#',' ','*',' ',' ','#'));
        expectedCharMap42.add(Arrays.asList('#',' ','.',' ',' ','#'));
        expectedCharMap42.add(Arrays.asList('#','#','#','#','#','#'));

        List<List<Character>> testCharMap1 = new ArrayList<>();
        testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        testCharMap1.add(Arrays.asList('#',' ','.',' ',' ','#'));
        testCharMap1.add(Arrays.asList('#',' ','+','$',' ','#'));
        testCharMap1.add(Arrays.asList('#',' ','*',' ',' ','#'));
        testCharMap1.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        testLevel.setCharMap(testCharMap1);
        testLevel.setPlayerPosition(new Position(2,3));
        testLevel.move(-1,0);
        assertEquals(testLevel.getCharMap(), expectedCharMap1);

        testCharMap1 = new ArrayList<>();
        testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        testCharMap1.add(Arrays.asList('#',' ','.',' ',' ','#'));
        testCharMap1.add(Arrays.asList('#',' ','+','$',' ','#'));
        testCharMap1.add(Arrays.asList('#',' ','*',' ',' ','#'));
        testCharMap1.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        testLevel.setCharMap(testCharMap1);
        testLevel.setPlayerPosition(new Position(2,3));
        testLevel.move(0,-1);
        assertEquals(testLevel.getCharMap(), expectedCharMap2);

        testCharMap1 = new ArrayList<>();
        testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        testCharMap1.add(Arrays.asList('#',' ','.',' ',' ','#'));
        testCharMap1.add(Arrays.asList('#',' ','+','$',' ','#'));
        testCharMap1.add(Arrays.asList('#',' ','*',' ',' ','#'));
        testCharMap1.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        testLevel.setCharMap(testCharMap1);
        testLevel.setPlayerPosition(new Position(2,3));
        testLevel.move(1,0);
        assertEquals(testLevel.getCharMap(), expectedCharMap31);

        List<List<Character>> testCharMap2 = new ArrayList<>();
        testCharMap2.add(Arrays.asList('#','#','#','#','#','#'));
        testCharMap2.add(Arrays.asList('#',' ','.',' ',' ','#'));
        testCharMap2.add(Arrays.asList('#',' ','+','$','.','#'));
        testCharMap2.add(Arrays.asList('#',' ','*',' ',' ','#'));
        testCharMap2.add(Arrays.asList('#',' ','.',' ',' ','#'));
        testCharMap2.add(Arrays.asList('#','#','#','#','#','#'));
        testLevel.setCharMap(testCharMap2);
        testLevel.setPlayerPosition(new Position(2,3));
        testLevel.move(1,0);
        assertEquals(testLevel.getCharMap(), expectedCharMap32);

        testCharMap1 = new ArrayList<>();
        testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        testCharMap1.add(Arrays.asList('#',' ','.',' ',' ','#'));
        testCharMap1.add(Arrays.asList('#',' ','+','$',' ','#'));
        testCharMap1.add(Arrays.asList('#',' ','*',' ',' ','#'));
        testCharMap1.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        testLevel.setCharMap(testCharMap1);
        testLevel.setPlayerPosition(new Position(2,3));
        testLevel.move(0,1);
        assertEquals(testLevel.getCharMap(), expectedCharMap41);

        testCharMap2 = new ArrayList<>();
        testCharMap2.add(Arrays.asList('#','#','#','#','#','#'));
        testCharMap2.add(Arrays.asList('#',' ','.',' ',' ','#'));
        testCharMap2.add(Arrays.asList('#',' ','+','$','.','#'));
        testCharMap2.add(Arrays.asList('#',' ','*',' ',' ','#'));
        testCharMap2.add(Arrays.asList('#',' ','.',' ',' ','#'));
        testCharMap2.add(Arrays.asList('#','#','#','#','#','#'));
        testLevel.setCharMap(testCharMap2);
        testLevel.setPlayerPosition(new Position(2,3));
        testLevel.move(0,1);
        assertEquals(testLevel.getCharMap(), expectedCharMap42);
    }

    @Test
    void testIsLevelOver() {
        List<List<Character>> testCharMap = new ArrayList<>();
        testCharMap.add(Arrays.asList('#','#','#','#','#','#'));
        testCharMap.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        testCharMap.add(Arrays.asList('#',' ','@','$',' ','#'));
        testCharMap.add(Arrays.asList('#',' ','*',' ',' ','#'));
        testCharMap.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        testCharMap.add(Arrays.asList('#','#','#','#','#','#'));

        Level testLevel = new Level();
        testLevel.setCharMap(testCharMap);
        assertTrue(testLevel.isLevelOver());
    }
}























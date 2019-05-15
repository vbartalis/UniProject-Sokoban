package model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PositionTest {

    @Test
    void setPosition() {
        List<List<Character>> testCharMap = new ArrayList<>();
        testCharMap.add(Arrays.asList('#','#','#','#','#','#'));
        testCharMap.add(Arrays.asList('#',' ','@',' ',' ','#'));
        testCharMap.add(Arrays.asList('#',' ',' ','$',' ','#'));
        testCharMap.add(Arrays.asList('#',' ','*',' ',' ','#'));
        testCharMap.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        testCharMap.add(Arrays.asList('#','#','#','#','#','#'));

        Position position = new Position();
        position.setPosition(testCharMap);
        assertEquals(position.getH(), 1);
        assertEquals(position.getW(), 2);

        testCharMap = new ArrayList<>();
        testCharMap.add(Arrays.asList('#','#','#','#','#','#'));
        testCharMap.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        testCharMap.add(Arrays.asList('#',' ',' ','$',' ','#'));
        testCharMap.add(Arrays.asList('#',' ','*',' ','+','#'));
        testCharMap.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        testCharMap.add(Arrays.asList('#','#','#','#','#','#'));

        position.setPosition(testCharMap);
        assertEquals(position.getH(), 3);
        assertEquals(position.getW(), 4);
    }
}
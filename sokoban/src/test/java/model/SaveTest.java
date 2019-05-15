package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaveTest {

    @Test
    void isNewRecord() {
        Save testSave = new Save();
        testSave.setRecordStep("5");

        assertTrue(testSave.isNewRecord("4"));
        assertFalse(testSave.isNewRecord("6"));

        testSave.setRecordStep("-");
        assertTrue(testSave.isNewRecord("6"));
    }
}
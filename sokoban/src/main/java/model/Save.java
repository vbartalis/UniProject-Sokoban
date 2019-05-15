package model;

import lombok.*;

/**
 * Class representing the best result of the player from a level.
 */
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Save {
    /**
     * The best result of a level.
     */
    String recordStep;
    /**
     * The id representing the level.
     */
    int levelNumber;

    /**
     * Constructor of {@link Save} class, creates an empty save.
     * @param levelNumber indicates the id representing which level does the save correspond to.
     */
    public Save(int levelNumber) {
        this.recordStep = "-";
        this.levelNumber = levelNumber;
    }

    /**
     * Checks if the {@code string} if a new record.
     * @param string the value to be chacked if it is a new record.
     * @return true if {@code string} is a new record.
     */
    public boolean isNewRecord(String string){
        if (recordStep.contentEquals("-") || Integer.parseInt(string) < Integer.parseInt(recordStep)) {
            return true;
        }
        return false;
    }


}

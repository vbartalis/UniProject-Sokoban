package model;

import lombok.*;

@ToString
@AllArgsConstructor
@Data
public class Save {
    String recordStep;
    int levelNumber;

    public Save(int levelNumber) {
        this.recordStep = "-";
        this.levelNumber = levelNumber;
    }

    public boolean isNewRecord(String string){
        if (recordStep.contentEquals("-") || Integer.parseInt(string) < Integer.parseInt(recordStep)) {
            return true;
        }
        return false;
    }


}

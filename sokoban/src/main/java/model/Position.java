package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Class representing the players position.
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Position {
    /**
     * Indicates the first coordinate of the player.
     */
    int h;
    /**
     * Indicates the second coordinate of the player.
     */
    int w;

    /**
     * Searches the {@code charMap} for the players coordinates, and
     * sets the position to it.
     *
     * @param charMap a list of character lists, in which is to be searched for the {@code position}.
     */
    public void setPosition(List<List<Character>> charMap) {
        for (int i = 0; i < charMap.size(); i++) {
            if (charMap.get(i).contains('@')) {
                h = i;
                w = charMap.get(i).indexOf('@');
            } else if (charMap.get(i).contains('+')) {
                h = i;
                w = charMap.get(i).indexOf('+');
            }
        }
    }
}
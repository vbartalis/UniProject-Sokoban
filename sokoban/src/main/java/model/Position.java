package model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class Position {
    int h;
    int w;


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
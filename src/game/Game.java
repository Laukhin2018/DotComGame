package game;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private int[] locationCell;
    int numOfHits = 0; // количечтво точных попаданий

    public void setLocationCell(int[] locs){
        locationCell = locs;
    }

    public String checkYourself(String stringGuess) {

        int guess = Integer.parseInt(stringGuess);
        String result = "Мимо";


        for (int cell : locationCell){
            if (guess == cell){
                result = "Попал";
                numOfHits++;
                break;
            }
        }

        if (numOfHits == locationCell.length){
            result = "Потопил";
        }

        System.out.println(result);
        return result;
    }
}

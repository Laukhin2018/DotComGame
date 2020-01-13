package game;

public class Game {

    int[] locationCell;
    int numOfHits = 0;

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

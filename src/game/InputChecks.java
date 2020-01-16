package game;

import java.util.ArrayList;

public class InputChecks {
    private ArrayList<Integer> movesAllGame = new ArrayList<Integer>();

    public void setMovesAllGame (String guess){
        try {
            int guessInt = Integer.parseInt(guess);
            boolean numExists = movesAllGame.contains(guessInt);
            if (numExists == true){
                return;
            }

            movesAllGame.add(guessInt);
        }
        catch (NumberFormatException e) {
            System.out.println("Вы ввели не число " + e);
        }

    }

    // проверка на повтор введеного пользователем хода
    public boolean checkRepeatedGuess(String numCheck){
        boolean numMatch = true;
        int num = Integer.parseInt(numCheck);

        for (int item : movesAllGame){
            if (item == num){
                System.out.println("Вы уже вводили число " + numCheck + ". Придумайте другое!");
                numMatch = false;
                break;
            }
        }

        return numMatch;
    }

    public boolean checkOnNum (String stringInput){
        boolean result = true;

        try{
            int numChecked = Integer.parseInt(stringInput);
        }
        catch (NumberFormatException e){
            System.out.println("Вы ввели не число " + e);
            result = false;
            return result;
        }
        return result;
    }
}

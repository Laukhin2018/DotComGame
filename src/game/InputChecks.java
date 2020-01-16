package game;

import java.util.ArrayList;

public class InputChecks {
    ArrayList<Integer> movesAllGame = new ArrayList<Integer>();

    //public void setMovesAllGame

    // проверка на повтор введеного пользователем хода
    public boolean checkRepeatedGuess(String numCheck){
        boolean numMatch = true;
        int num = Integer.parseInt(numCheck);

        for (int item : movesAllGame){
            if (item == num){
                System.out.println("Вы уже вводили это число " + numCheck + ". Придумайте другое!");
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

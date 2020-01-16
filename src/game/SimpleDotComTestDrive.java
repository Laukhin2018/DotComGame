package game;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleDotComTestDrive {


    public static void main(String[] args) {
        int numGuess = 0;
        int sell = (int) (Math.random()*5);
        int[] locations = {sell, sell+1, sell+2};

        GameHelper helper = new GameHelper();
        Game dot = new Game();

        dot.setLocationCell(locations);

        boolean isAlive = true;
        ArrayList<Integer> movesAllGame = new ArrayList<Integer>();

        while (isAlive == true){

            // моя реализация ввода из консоли
            /*
            Scanner in = new Scanner(System.in);
            System.out.print("Input your cell: ");
            String sellUser = in.nextLine();
            String result = dot.checkYourself(sellUser);
            */

            // реализация из HeadFirst, с помощью класса GameHelper
            String guess = helper.getUserInput("Введите число");

            // проверка на число
            String result;
            int moveCurrent;
            try{
                moveCurrent = Integer.parseInt(guess);
            }
            catch (NumberFormatException e){
                System.out.println("Вы ввели не число " + e);
                numGuess++; // колличество сделанных ходов
                continue;
            }

            // проверка на повтор введеного пользователем хода
            boolean sameGuess = false;
            for (int item : movesAllGame){
                if (item == moveCurrent){
                    System.out.println("Вы уже вводили это число " + moveCurrent + ". Придумайте другое!");
                    sameGuess = true;
                    break;
                }
            }
            if (sameGuess){
                numGuess++; // колличество сделанных ходов
                continue;
            }

            result = dot.checkYourself(guess);

            // завершение игры
            if(result.equals("Потопил")){
                isAlive = false;
                System.out.println("Сайт потоплен. Вам потребовалось " + numGuess + " попыток");
            }

            movesAllGame.add(moveCurrent);
            numGuess++; // колличество сделанных ходов
        }

        /*
        for ( ; ;){
            String stringGuess = String.valueOf(numGuess);
            String result = dot.checkYourself(stringGuess);

            if (result == "Потопил"){
                System.out.println("Проверка завершина!!!");
                break;
            }

            numGuess++;
        }
        String resultWhile = "";
        while (!resultWhile.equals("Потопил")){
            String stringGuess = String.valueOf(numGuess);
            resultWhile = dot.checkYourself(stringGuess);
            numGuess++;
        }
        System.out.println("Проверка завершина!!!");
        */
    }
}

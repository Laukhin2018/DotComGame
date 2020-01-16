package game;

import java.util.ArrayList;


public class SimpleDotComTestDrive {


    public static void main(String[] args) {
        int numGuess = 0;
        int sell = (int) (Math.random()*5);
        int[] locations = {sell, sell+1, sell+2};

        GameHelper helper = new GameHelper();
        Game dot = new Game();
        InputChecks checker = new InputChecks();

        dot.setLocationCell(locations);

        boolean isAlive = true;
        while (isAlive == true){
            // реализация из HeadFirst, с помощью класса GameHelper
            String guess = helper.getUserInput("Введите число");

            // проверка на число
            boolean isNum = checker.checkOnNum(guess);
            if (isNum == false){
                numGuess++; // колличество сделанных ходов
                continue;
            }

            // проверка на однинаковые ввод
            boolean sameGuess = checker.checkRepeatedGuess(guess);
            if (sameGuess == false){
                numGuess++; // колличество сделанных ходов
                continue;
            }

            // проверяем попадание по сайту
            String result = dot.checkYourself(guess);

            // завершение игры
            if(result.equals("Потопил")){
                isAlive = false;
                System.out.println("Сайт потоплен. Вам потребовалось " + numGuess + " попыток");
            }

            checker.setMovesAllGame(guess);
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

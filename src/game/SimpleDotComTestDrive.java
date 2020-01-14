package game;

import java.util.Scanner;

public class SimpleDotComTestDrive {


    public static void main(String[] args) {
        int numGuess = 0;
        int sell = (int) (Math.random()*5);
        int[] locations = {sell, sell+1, sell+2};

        Game dot = new Game();

        dot.setLocationCell(locations);

        boolean isAlive = true;

        while (isAlive == true){

            Scanner in = new Scanner(System.in);
            System.out.print("Input your cell: ");
            String sellUser = in.nextLine();
            String result = dot.checkYourself(sellUser);
            numGuess++;
            if(result.equals("Потопил")){
                isAlive = false;
                System.out.println("Сайт потоплен. Вам потребовалось " + numGuess + " попыток");
            }
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

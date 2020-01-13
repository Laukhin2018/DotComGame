package game;

public class SimpleDotComTestDrive {


    public static void main(String[] args) {
        Game dot = new Game();
        int[] locations = {3, 4, 5};
        dot.setLocationCell(locations);

        int intGuess = 0;
        for ( ; ;){
            String stringGuess = String.valueOf(intGuess);
            String result = dot.checkYourself(stringGuess);

            if (result == "Потопил"){
                System.out.println("Проверка завершина!!!");
                break;
            }

            intGuess++;
        }
    }
}

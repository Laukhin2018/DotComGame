package game;

import java.io.*;
import java.util.Scanner;

public class GameHelper {
    public String getUserInput(String prompt){
        String inputLine = null;
        System.out.print(prompt + " ");
        try{
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if(inputLine.length() == 0) return null;
        }
        catch (IOException e){
            System.out.println("IOException: " + e);
        }
        return inputLine;
    }

    // моя реализация ввода из консоли
    public  String myGetUserInut(String prompt){
        Scanner in = new Scanner(System.in);
        System.out.print("Input your cell: ");
        prompt = in.nextLine();
        return prompt;
    }
}

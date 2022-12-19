//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class Task1 {
    public static void main(String[] args) {
        Logger logger = Logger.getAnonymousLogger();
        logger.info(readFromTxt());
        logger.info(calc());
    }

    public static String readFromTxt() {

        try {
            BufferedReader bf = new BufferedReader(new FileReader("./src/task1.txt"));
            String str = bf.readLine();
            return str;

        } catch (FileNotFoundException e) {
            return "File not found";
        } catch (IOException e) {
            return "Problem with in/out process";
        }
    }



    public static String calc() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Input sing('+' '-' '*' '/'): ");
            String sing = scanner.nextLine();
            System.out.printf("Input X: ");
            Long x = scanner.nextLong();
            System.out.printf("Input Y: ");
            Long y = scanner.nextLong();

            if (sing.equals("+")) {
                return String.valueOf(x+y);
            } else if (sing.equals("-")) {
                return String.valueOf(x-y);
            } else if (sing.equals("*")) {
                return String.valueOf(x*y);
            } else if (sing.equals("/")) {
                try {
                    return String.valueOf(x/y);
                } catch (ArithmeticException e) {
                    return "Divide by zero!";
                }
            } else { return "Wrong sing!"; }
        } catch (InputMismatchException e) {
            return "Wrong user's data";
        }
    }
}
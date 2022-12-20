/* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий
новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода
единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше
 */

import java.util.Random;
import java.util.logging.Logger;

public class Task4 {
    public static void main(String[] args) {
        Logger logger = Logger.getAnonymousLogger();
        int [] arr1 = fillArray();
        int [] arr2 = fillArray();
        logger.info(showArray(arr1));
        logger.info(showArray(arr2));
        logger.info(showArray(newArray(arr1, arr2)));
    }

    public static int[] fillArray() {
        Random random = new Random();
        int[] arr = new int [new Random().nextInt(5, 10)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(0, 10);
        }
        return arr;
    }

    public static String showArray(int [] arr) {
        String strArr = "";
        for (int i = 0; i < arr.length; i++) {
            strArr += arr[i] + " ";
        }
        return strArr;
    }

    public static int[] newArray(int[] arr1, int[] arr2) {
        int [] newArr;
        if (arr1.length > arr2.length) {
            newArr = new int[arr1.length];
        } else {
            newArr = new int[arr2.length];
        }
        for (int i = 0; i < newArr.length; i++) {
            try {
                newArr[i] = arr1[i]/arr2[i];
            } catch (ArithmeticException e) {
                System.out.println("Divide by zero!");
            } catch (RuntimeException e) {
                System.out.println("length arr1 != length arr2");
                break;
            }
        }
        return newArr;
    }

}

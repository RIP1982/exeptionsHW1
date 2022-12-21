/* Реализуйте метод, принимающий в качестве аргументов двумерный массив. Метод должен проверить что
длина строк и столбцов с одинаковым индексом одинакова, детализировать какие строки со столбцами не
требуется. Как бы вы реализовали подобный метод.
 */

public class Task6 {
    public static void main(String[] args) {
        String [][] arr = {{"1", "2", "3"}, {"1", "2"}, {"3", "2", "3"}};
        compareRowWithColumn(arr);
    }

    public static void compareRowWithColumn(String [][] arr) {
        int countRow = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i].length) {
                max = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            countRow++;
            int countColumn =0;
            for (int j = 0; j < arr[max].length; j++) {
                countColumn++;
                if (countRow == countColumn) {
                    if (arr.length == arr[j].length) {
                        System.out.println(countRow + " countRow" + " == " + countColumn + " countColumn");
                    } else {
                        System.out.println(countRow + " countRow" + " != " + countColumn + " countColumn");
                    }
                }
            }
        }
    }
}

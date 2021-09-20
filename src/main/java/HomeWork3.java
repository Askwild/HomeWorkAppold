import java.util.Arrays;

public class HomeWork3 {

    public static void main(String[] args) {
        int[] array01 = {1, 1, 1, 0, 0, 0, 1, 0, 1, 0};
        System.out.println(Arrays.toString(integerArray(array01)));

        int[] arr2 = new int[100];
        emptyIntegerArr(arr2, 1, 1);
        System.out.println(" " + Arrays.toString(arr2));

        int[] arrayNumbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multipliedArray(arrayNumbers);
        System.out.println(Arrays.toString(arrayNumbers));

        dimensionalIntegerArray(4);

        //retLenArr("5", "6");

    }

    //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static int[] integerArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
        return array;
    }

    //2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    public static void emptyIntegerArr(int[] array, int step, int shift) {
        for (int i = 0; i < 100; i++) {
            array[i] = shift + i * step;
        }
    }

    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void multipliedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }

    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные
    // элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
    // индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
    public static void dimensionalIntegerArray(int size) {
        int[][] sqrArray = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sqrArray[i][j] = (i == j || j == (size - i - 1)) ? 1 : (int) (Math.random() * 100);
                System.out.printf("%4d", sqrArray[i][j]);
            }
            System.out.println();
        }

    }

    /*5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий
    // одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    public static int[] retLenArr(String len, String initialValue) {
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }*/ //------------------------//НЕЗНАЮ КАК ДЕЛАТЬ

}


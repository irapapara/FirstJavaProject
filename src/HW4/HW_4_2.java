package HW4;

import java.util.Arrays;

public class HW_4_2 {
    public static void main(String[] args) {
        /*
        Given an array:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
You need to print all array values greater than 5.

        Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести все значения массива больше 5.
         */
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i = 0; i < array.length; i++){
            if (array[i] > 5 ) {
                System.out.println(array[i]);
            }
        }

    }
}

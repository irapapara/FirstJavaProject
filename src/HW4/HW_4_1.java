package HW4;

import java.util.Arrays;

public class HW_4_1 {
    public static void main(String[] args) {
        /*
        Given an array:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
you need to output all odd numbers from the array.

        Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести все нечетные числа из массива.
         */
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i = 0; i < array.length; i++) {
            int currentElement = array[i];
            if (currentElement % 2 > 0) {
                System.out.println("it is odd element" + array[i] );
            }


        } //System.out.println(Arrays.toString(array));
    }
}

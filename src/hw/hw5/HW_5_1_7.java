package hw.hw5;

public class HW_5_1_7 {
    public static void main(String[] args) {
        /*
Задача №7
Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести количество элементов в массиве.
         */
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int count = 0;;

        for (int i = 0; i < array.length; i++ ) {
               count += array[i].length;
            System.out.println("array length "+ i + "is equal" +  array[i].length );
        }
        System.out.println("number of elements"+ count);
    }
}


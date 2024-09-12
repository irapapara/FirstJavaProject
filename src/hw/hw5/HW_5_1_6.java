package hw.hw5;

public class HW_5_1_6 {
    public static void main(String[] args) {
        /*
Задача №6

Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести максимальное значение массива.
         */
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int maxij = Integer.MIN_VALUE;;
        int max = Integer.MIN_VALUE;;

        for (int i = 0; i < array.length; i++ ) {
            for (int j = 0; j < array[i].length; j++ ) {
                if (array[i][j] > maxij){
                    maxij = array[i][j];
                }
            }
            System.out.println("array max "+ i + "is equal" +  maxij );
            }

        System.out.println("array max "+ "is equal" +  maxij );

    }
}

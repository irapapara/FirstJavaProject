package hw.hw5;

public class HW_5_1_4 {
    public static void main(String[] args) {
        /*
      Задача №4
Дан массив:
int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
необходимо вывести среднее арифметическое всех значений массива.
         */
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;;
        for (int i = 0; i < array.length; i++ ) {
            sum += array[i];
            }
        double average = sum / array.length;
        System.out.println( "среднее арифметическое" + average);
        System.out.println("сумма "+ sum);
        System.out.println("длина массива"+ array.length);
    }
}

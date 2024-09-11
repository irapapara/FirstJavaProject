package hw.hw3;

public class HW_3_2_2 {
    public static void main(String[] args) {
        /*
        You need to print all positive powers of the number 5 that are less than 10,000,
        and output the result of each exponentiation.

        Необходимо вывести все положительные степени числа 5 которые меньше 10000,
         вывести результат возведения в степень.
         */

        int base = 5;
        for (int i = 5; i <= 10000; i = i * 5) {
            System.out.println(i);
        }
    }
}

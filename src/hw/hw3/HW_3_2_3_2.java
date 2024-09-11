package hw.hw3;

public class HW_3_2_3_2 {
    public static void main(String[] args) {
        /*
You need to print all numbers divisible by 4 between 40 and 60 inclusive.
Implement two versions:
1. Use an if statement to determine divisibility (with a loop increment of 1, i = i + 1).
2. Without using an if statement (choose the loop increment at your discretion).
        Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
Реализовать 2 варианта:
использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
без использования конструкции if (шаг цикла на ваше усмотрение).
         */


        for (int i = 40; i <= 60; i = i + 4) {

                System.out.println(i);

            //System.out.println(i);
        }
    }
}

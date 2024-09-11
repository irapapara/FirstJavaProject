package hw.hw3;

public class HW_3_1_1 {
    public static void main(String[] args) {


    /*
    Необходимо создать две целочисленные переменные (a, b),
    присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
    a == b - если переменные равны
    a < b - если переменная a меньше b
    a > b - если переменная b меньше a
You need to create two integer variables (a, b), assign arbitrary values to the variables of your choice, and output the following strings:
- "a == b" - if the variables are equal
- "a < b" - if variable a is less than b
- "a > b" - if variable b is less than a
     */
        int a = 1;
        int b = 1;
        if (a == b) {
            System.out.println("a = b");
        } else {
            if (a < b) {
                System.out.println("a < b");
            } else {
                System.out.println("a > b");
            }

        }
    }
}
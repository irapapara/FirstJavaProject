package HW.HW3;

public class HW_3_1_2 {
    public static void main(String[] args) {
        /*
        You need to create two integer variables (a, b),
        assign arbitrary values to the variables of your choice,
        and output the following strings:
- "maybe a and b are even" - if the sum of the variables is even
- "some variable is odd" - if the sum of the variables is odd

         Необходимо создать две целочисленные переменные (a, b),
         присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
maybe a and b are even - если сумма переменных четная
some variable is odd - если сумма переменных нечетная

         */
        int a = 3;
        int b = 4;
        if ((a + b) % 2 == 0) {// check for even number
            System.out.println("maybe a and b are even");
        } else {
            System.out.println("some variable is odd");
        }
    }
}
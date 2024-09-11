package hw.hw3;

public class HW_3_1_3 {
    public static void main(String[] args) {
        /*
        You need to create an integer variable, assign an arbitrary value to the variable of your choice, and output the following strings:
- "greater than 10" - if the variable is greater than 10
- "less than 100" - if the variable is less than 100
- "result of division by 2 is greater than 20" - if this is true
- "variable value is between 5 and 40 inclusive" - if this is true
- "variable value is less than 5 or greater than 40" - if the previous condition is false

        Необходимо создать целочисленную переменную,
        присвоить произвольное значение переменной на ваш выбор и вывести следующие строки:
больше 10 - если переменная больше 10
меньше 100 - если переменная меньше 100
результат деления на 2 больше 20 - если это соответствует истине
значение переменной между 5 и 40 включительно - если это правда
значение переменной меньше 5 или больше 40 - если предыдущие условие ложное
         */
        int a = 41;
        if (a > 10 ) {
            System.out.println("a > 10");

        }
        if (a < 100) {
            System.out.println("a < 100");
        }
        if (a/2.0 > 20){// result will be double type
            System.out.println("a/2 > 20" );
        }
        if (a >= 5 && a <= 40) {
            System.out.println("a <= 5 && a >= 40");
        } else {
            System.out.println("a <= 5 && a >= 40");
        }
    }
}

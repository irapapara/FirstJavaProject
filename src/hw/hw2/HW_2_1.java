package hw.hw2;

public class HW_2_1 {
    public static void main(String[] args) {
        /*Необходимо создать целочисленные переменные a и b,
        присвоить произвольные значения переменным на ваш выбор и
        вывести результаты следующих операций с этими переменными:
        сложение, умножение, вычитание, деление и остаток от деления.
        Также сделать проверку на четность этих переменных и вывести результат.*/
        int a= 25;
        int b=6;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        //проверка на четность
        System.out.println(a%2);//если остаток 0 значит четное, если нет - значит не четное
        System.out.println(b%2);
    }

}

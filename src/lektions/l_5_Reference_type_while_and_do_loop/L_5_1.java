package lektions.l_5_Reference_type_while_and_do_loop;

import java.util.Arrays;

public class L_5_1 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        a = 0;
        System.out.println(b);  // примитивные типы, передаются значения. Поэтому если меняем одну переменную, меняется значение только этой переменной

        int [] arr1 = {1, 2, 3, 4}; // arr1, arr2 - это ссылки на массив. Массив один на самом деле {1, 2, 3, 4}
        int [] arr2 = arr1;
        arr2 [0] = -1;
        System.out.println(Arrays.toString(arr1)); // массив reference type и поэтому меняется в обоих местах, тк  ссылочный тип. Массив всегда один и тот же, копируется ссылка
        System.out.println(Arrays.toString(arr2));// в памяти хранится один массив, а ссылаются на него две переменные, как ярлык на одну и ту же папку
    }
}

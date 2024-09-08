package HW4;

public class HW_4_4_1way {
    public static void main(String[] args) {
        /*
Given an array of ten arbitrary integers (for example, { 1, 2, …, 9, 10 })
It is necessary to reverse the order of the array elements (i.e., to get { 10, 9, …, 2, 1 } ).
 Do not PRINT in reverse order, but rearrange the elements of the array.

Дан массив из десяти произвольных целых чисел (например, { 1, 2, …, 9, 10 } )
Необходимо изменить порядок элементов массива на противоположный
(т.е. чтобы получилось { 10, 9, …, 2, 1 } ). Не НАПЕЧАТАТЬ в обратном порядке,
 а переставить элементы массива.


         */
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] arraynew = new int [10];
        for (int i = 0; i < array.length; i++){ // i = i +1 или i += 1
            arraynew[i] = array [array.length - (i + 1) ];
            System.out.println(arraynew[i]);

        }
    }
}

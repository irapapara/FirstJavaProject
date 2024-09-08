package L_4_Arrays_searching_for_sum_minimum_maximum;


import java.util.Arrays;

public class L_4_4 {
    public static void main(String[] args) {
        /*
        июль : 15.0, 21.8, 20.5, 18,9
        август: 22.8, 25.6, 25.9, 30.5, 24.8, 26.8
         */
//


       // double [] julyRides = {15.0, 21.8, 20.5, 18.9};// сейчас так можно задавать массив
        double [] augustRides = new double[6];// раньше так задавали массивы
        augustRides [0] = 22.8;
        augustRides [1] = 25.6;
        augustRides [2] = 25.9;
        augustRides [3] = 30.5;
        augustRides [4] = 24.8;
        augustRides [5] = 26.8;

        double max = Double.MIN_VALUE;
        double total = 0;
        //System.out.println(julyRides);//напечатает ссылку на объект
        //System.out.println(Arrays.toString(julyRides));//распечатает содержимое массива

        for (int index = 0; index < augustRides.length; index++) {// julyRides.length - длина массива
            if (augustRides[index]> max){
                max = augustRides[index];
            }


        }
        System.out.println("shortest ride" + max);
    }


}




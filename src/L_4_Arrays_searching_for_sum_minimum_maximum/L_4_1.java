package L_4_Arrays_searching_for_sum_minimum_maximum;

import java.util.Arrays;

public class L_4_1 {
    public static void main(String[] args) {
        /*
        июль : 15.0, 21.8, 20.5, 18,9
        август: 22.8, 25.6, 25.9, 30.5, 24.8, 26.8
         */

    //julyRides[0] = 15.0; затем упростили и получили
        //double [] julyRides = new double[] {15.0, 21.8, 20.5, 18,9}; затем упростили и получили
        // double [] julyRides = {} создаст пустой массив
        //double [] julyRides = new double [15] создаст пустой массив с 15 элементами
        double [] julyRides = {15.0, 21.8, 20.5, 18.9};
        double total = 0;
        //System.out.println(julyRides);//напечатает ссылку на объект
        System.out.println(Arrays.toString(julyRides));//распечатает содержимое массива

        for (int index = 0; index < julyRides.length; index++) {// julyRides.length - длина массива
            System.out.println("index" + index);
            System.out.println("ride length" + julyRides[index]);// распечатает массив по одному элементу на строку
            total = total +  julyRides [index];
            System.out.println("total so far" + total);
        }
        System.out.println("total" + total);
    }


}

package L_4_Arrays_searching_for_sum_minimum_maximum;


import java.util.Arrays;

public class L_4_6 {
    public static void main(String[] args) {
        /*
        июль : 15.0, 21.8, 20.5, 18,9
        август: 22.8, 25.6, 25.9, 30.5, 24.8, 26.8
         */
        int[] ints = {1, 2, 3, 4, 17};
        for (int i : ints) {// перебираем элементы массива ints , это  сокращенная форма записи
            System.out.println(i);
        }
        double[][] allRides;
        allRides = new double[][]{
                {15.0, 21.8, 20.5, 18.9},
                {22.8, 25.6, 25.9, 30.5, 24.8, 26.8}
        };
        System.out.println(Arrays.toString(allRides[0]));
        System.out.println(Arrays.toString(allRides[1]));
        System.out.println(allRides[0][3]);
        System.out.println(allRides.length);

        double max = -Double.MAX_VALUE;
        System.out.println(max);
        for (int i=0; i < allRides.length; i = i +1){
            for (int j = 0; j < allRides[i].length; j = j + 1) {
                if (allRides[i][j] > max) {
                    max = allRides[i][j];
                }
            }
        }
        System.out.println("The longest ride ever is" + max);

        }

    }







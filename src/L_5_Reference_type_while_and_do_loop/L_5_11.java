package L_5_Reference_type_while_and_do_loop;

public class L_5_11 {
    public static void main(String[] args) {

        int [] arr = {2, 4, 6, 8};
        int [][] arr2 = {
                {2, 4},
                {6, 7, 8, 9},
                {10, 12}
        };
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {

                System.out.println(arr2[i][j]);
            }


        }
            System.out.println();
    }
}





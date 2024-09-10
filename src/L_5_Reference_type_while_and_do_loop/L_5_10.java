package L_5_Reference_type_while_and_do_loop;

public class L_5_10 {
    public static void main(String[] args) {


        for (int i = 0; i <  10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i >= 3 && i <= 6 && j >= 3 && j <= 6){
                System.out.print("-");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

}




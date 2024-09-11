package lektions.l_5_Reference_type_while_and_do_loop;

public class L_5_14 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++ ) {

            if ( i == 5) {
                continue;// прерывает итерацию, вернется обратно и начнет след итерацию
            }
            System.out.println( i );
        }


    }
}





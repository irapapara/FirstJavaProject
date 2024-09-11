package lektions.l_5_Reference_type_while_and_do_loop;

public class L_5_8 {
    public static void main(String[] args) {
        String str = "Hello world!";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'l') {
                count ++;
            }
        }
        System.out.println(count);
    }

}


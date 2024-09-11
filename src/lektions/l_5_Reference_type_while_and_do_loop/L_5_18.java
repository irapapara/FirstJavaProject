package lektions.l_5_Reference_type_while_and_do_loop;

public class L_5_18 {
    public static void main(String[] args) {
       String str = "Hello world!";
        while (str.length() > 5) {
            str = str.substring(0,str.length() - 1);
        }
        System.out.println(str);
    }
}





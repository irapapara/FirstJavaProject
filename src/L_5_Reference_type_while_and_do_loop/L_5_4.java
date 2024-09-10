package L_5_Reference_type_while_and_do_loop;

public class L_5_4 {
    public static void main(String[] args) {
        String str = "Hello world";

        System.out.println(str.length());
        System.out.println(str.charAt(7));

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}

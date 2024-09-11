package lektions.l_5_Reference_type_while_and_do_loop;

public class L_5_5 {
    public static void main(String[] args) {
        String str = "Hello world";



        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'w') {// char - это всегда один символ
                //ctrl + Q отображает помощь по charAt
                System.out.println("index of w is " + i);
            }
            System.out.println(str.indexOf('s'));//ctrl + пробел - отображает список всех методов
        }

    }
}

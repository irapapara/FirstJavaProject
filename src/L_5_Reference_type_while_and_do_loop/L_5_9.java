package L_5_Reference_type_while_and_do_loop;

public class L_5_9 {
    public static void main(String[] args) {
        String[] arr = {"Hello", "world", "!777"};

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == '7') {
                count++;
                }
            }
        }
        System.out.println(count);
    }

}


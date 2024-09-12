package hw.hw5;

public class HW_5_2_4 {
    public static void main(String[] args) {
        /*
        з 4
        Дан массив:
String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.
         */
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
               if (array[i][j].indexOf("е") == -1) {
                   count++;
               }
            }

        }
        System.out.println(count);
    }
}

package hw.hw5;

public class HW_5_2_3 {
    public static void main(String[] args) {
        /*
        Задача №3
Дана строка:
String s = “Посмотрите как Рите нравится ритм”;
необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
Для указанной строки ответ будет 6, 15, 29.
         */
        String s = "Посмотрите как Рите нравится ритм";
        String subStr = "рит";
        for (int i = 0; i < s.length() - subStr.length(); i++) {
            if (subStr.equalsIgnoreCase(s.substring(i, i + subStr.length()))){
                System.out.println(i);
            }
        }
    }
}

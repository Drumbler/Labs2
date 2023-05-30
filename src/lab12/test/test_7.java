package lab12.test;

import java.util.List;
import java.util.stream.Collectors;
public class test_7 {
    public static void main(String[] args) {
        String string = "Напишите функцию Которая принимает на вход список " +
                "строк и возвращает новый список, Содержащий только те строки, " +
                "который Начинаються с большой буквы. ";
        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Cтрока после сплитования : " + "\n");
        for (String e: strings){
            System.out.println(e);
        }

        int num = 8;
        List<String> stringAfter = filterCapitalizedString(strings, num);
        System.out.println("\n" + "Cтрока после преобразования : " + "\n");

        for (String e: stringAfter){
            System.out.println(e);
        }
    }

    private static List<String> filterCapitalizedString(List<String> list, int j) {
        return list.stream()
                .filter(s -> s.length() > j)
                .collect(Collectors.toList());
    }
}

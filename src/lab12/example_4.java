package lab12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
public class example_4 {
    public static void main(String[] args) {

        List<Integer> integer = new ArrayList<>();
        Random random = new Random();

        System.out.println("\n" + "Cписок до: " + "\n");
        for (int i = 0 ; i < 10; i++){
            integer.add(random.nextInt(200));
            System.out.println(integer.get(i));
        }

        List <Integer> integerAfter = squareList(integer);
        System.out.println("\n" + "Список после возведения в квадрат: " + "\n");

        for (Integer i: integerAfter){
            System.out.println(i);
        }
    }

    private static List<Integer> squareList(List<Integer> list) {
        return list.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
    }
}
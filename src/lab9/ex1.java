package lab9;

import java.util.InputMismatchException;
//import java.util.Random;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        int amount = 0;
        int sum = 0;
        int size = 10;
        int[] numbers = new int[size];
//        Random random = new Random();
        Scanner scan = new Scanner(System.in);
//        IntStream.range(0,size).forEach(index -> numbers[index] = random.nextInt(-20, 20));
//        System.out.println(Arrays.toString(numbers));

        System.out.println("Введите числа массива, " + size + " чисел");
        try {
            for (int i = 0; i < size; i++) {
                numbers[i] = scan.nextInt();
            }

            for (int i = 0; i < size; i++) {
                if (numbers[i] > 0) {
                    sum = sum + numbers[i];
                    amount++;
                }
            }

            sum = sum / amount;
            System.out.println(sum);
        }
        catch(ArithmeticException exception) {
            System.out.println("Ошибка! В массиве только числа с минусом!");
        }
        catch (InputMismatchException exception ){
            System.out.println("Ошибка! Тип данных не соответсвует массиву!");
        }
    }

}
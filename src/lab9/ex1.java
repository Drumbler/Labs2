package lab9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        int amount = 0;
        int sum = 0;
        int size = 10;
        int[] numbers = new int[size];
        Scanner scan = new Scanner(System.in);

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
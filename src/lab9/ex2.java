package lab9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] array =new int[5][5];
        try {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = (int) (Math.random() * 10);
                }
            }
            for (int i = 0; i < array.length; i++, System.out.println()) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println("Введите номер стобца");
            int col = scan.nextInt() - 1;
            System.out.println(" ");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i][col]);
            }
        }
        catch (InputMismatchException e){
            System.out.println("Ошибка! Введите число!");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ошибка! Такого столбца нет!");

        }
    }
}




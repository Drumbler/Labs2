package lab9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte array[] = new byte[3];
        byte sum;
        int j;
        System.out.println("Введите 3 числа");
        try{
            for(int i = 0; i < array.length; i++) {
                array[i] = scan.nextByte();
                System.out.print(array[i] + " ");

            }
            System.out.println(" ");
            for(sum= 0, j = array.length -1; 0 <= j;sum+= array[j--]);
            System.out.println(sum);
            System.out.println();
        }
        catch (InputMismatchException e){
            System.out.println("Ошибка! Формат введенных данных неверен");
        }
    }
}

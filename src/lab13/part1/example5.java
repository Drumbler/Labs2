package lab13.part1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class example5 {
    public static int result = 0;
    public static void main(String[] args) throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int sc = scanner.nextInt();
        int[] arr = new int[sc];
        Random random = new Random();
        for (int i = 0; i < sc; i++) {
            arr[i] = random.nextInt(1000000);
        }
        System.out.println(Arrays.toString(arr));
        fastmax(arr, sc);
    }
    public static void fastmax(int[] arr, int sc) throws InterruptedException{
        int courentSC1 = sc / 3;
        Thread core1 = new Thread(() -> {
            for (int i = 0; i < courentSC1; i++) {
                if (result < arr[i]) {
                    result = arr[i];
                }
            }
        });

        Thread core2 = new Thread(() -> {
            for (int i = courentSC1; i > 0; i--) {
                if (result < arr[i]) {
                    result = arr[i];
                }
            }
        });
        Thread core3 = new Thread(() -> {
            for (int i = courentSC1; i < courentSC1 * 2; i++) {
                if (result < arr[i]) {
                    result = arr[i];
                }
            }
        });
        Thread core4 = new Thread(() -> {
            for (int i = courentSC1 * 2; i > courentSC1; i--) {
                if (result < arr[i]) {
                    result = arr[i];
                }
            }
        });
        Thread core5 = new Thread(() -> {
            for (int i = courentSC1 * 2; i < sc; i++) {
                if (result < arr[i]) {
                    result = arr[i];
                }
            }
        });
        Thread core6 = new Thread(() -> {
            for (int i = sc-1; i > courentSC1 * 2; i--) {
                if (result < arr[i]) {
                    result = arr[i];
                }
            }
        });
        core1.start();
        core2.start();
        core3.start();
        core4.start();
        core5.start();
        core6.start();
        core6.join();
        System.out.println(result);
        int z = 0;
        for (int ff =0 ; ff<arr.length-1; ff++){
            if (arr[ff]>z){
                z = arr[ff];
            }
        }
        System.out.println("Конечный max: " + z);
    }
}

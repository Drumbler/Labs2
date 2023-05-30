package lab12.test;

import java.util.Arrays;
import java.util.Random;
public class test_1 {
    public static void main(String[] args) {
        int size = 10;
        int[] arr = new int[size];

        Random random = new Random();

        for (int i = 0; i < size; i++){
            arr[i] = random.nextInt();
        }

        System.out.println("Массив arr: ");
        System.out.println(Arrays.toString(arr));

        int[] arrResult = filterEvenNumbers(arr);

        System.out.println("Массив arrResult: ");
        System.out.println(Arrays.toString(arrResult));

    }

    private static int[] filterEvenNumbers(int[] arr) {

        return Arrays.stream(arr).filter(x -> x % 2 == 0).toArray();
    }
}

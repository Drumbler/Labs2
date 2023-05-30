package lab12.test;

import java.util.Arrays;
import java.util.Random;
public class test_2{
    public static void main(String[] args) {
        int size = 5;

        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        Random random = new Random();

        for (int i = 0; i < size; i++){
            arr1[i] = random.nextInt(200);
            arr2[i] = random.nextInt(200);
        }
        System.out.println("Массив arr1: ");
        System.out.println(Arrays.toString(arr1));
        System.out.println("Массив arr2: ");
        System.out.println(Arrays.toString(arr2));

        int[] arrResult = findCommonElements(arr1,arr2);

        System.out.println("Массив arrResult: ");
        System.out.println(Arrays.toString(arrResult));
    }

    private static int[] findCommonElements(int[] arr1, int[] arr2) {
        return Arrays.stream(arr1)
                .filter(x -> Arrays.stream(arr2)
                        .anyMatch(y -> y == x))
                .toArray();
    }
}
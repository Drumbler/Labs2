package lab12.test;
import java.util.Arrays;
import java.util.Random;
public class test_10 {
    public static void main(String[] args) {
        int size = 10;
        int[] arr = new int[size];

        Random random = new Random();

        for (int i = 0; i < size; i++){
            arr[i] = random.nextInt(200);
        }

        System.out.println("Массив arr: ");
        System.out.println(Arrays.toString(arr));

        int num = 100;
        int[] arrResult = filterEvenNumbers(arr, num);

        System.out.println("Массив arrResult: ");
        System.out.println(Arrays.toString(arrResult));

    }

    private static int[] filterEvenNumbers(int[] arr, int j) {

        return Arrays.stream(arr).filter(x -> x < j).toArray();
    }
}
package lab11.Part3;

public class example03_2 {
    public static void main(String[] args) {
        int[] numArray = {1, 2, 3, 4, 5};
        int index = numArray.length;
        printArray(numArray, index);
        int arrSize = 10;
        int[] arrToFill = new int[arrSize];
        System.out.println("\n");
        fillArray(arrToFill, arrSize);
        printArray(arrToFill, arrSize);
    }
    public static void fillArray(int[] arr, int i) {

        if (i == 0) return;
        else fillArray(arr, i - 1);
        arr[i - 1] = 10 * (i - 1);
    }
    public static void printArray(int[] arr, int num) {
        if (num == 0) return;
        else printArray(arr, num - 1);

        System.out.print(arr[num - 1] + " ");
    }
}

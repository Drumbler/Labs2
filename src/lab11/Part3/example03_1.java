package lab11.Part3;

import java.util.Scanner;
public class example03_1 {
    public class task_1 {
        static Scanner in = new Scanner(System.in);

        public static void main(String[] args) {
            int num = 10;
            recursion(num);
            System.out.print(str);
        }

        static String str = "";

        private static void recursion(int i) {
            if (i > 0) {
                recursion(i / 2);
                str += Integer.toString(i % 2);
                System.out.println(i % 2);
            }
        }
    }
}
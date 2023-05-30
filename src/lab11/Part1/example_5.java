package lab11.Part1;

public class example_5 {
    public static void main(String[] args) {
        System.out.println(fact(6));
    }

    static int i = 1;

    private static int fact(int n) {
        System.out.println(i + " --> " + n);
        i++;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fact(n - 2) + fact(n - 1);
        }
    }
}

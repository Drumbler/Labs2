package lab11.Part1;

public class example_1 {
    public static void main(String[] args) {
        m(1);
    }

    private static void m(int x) {
        System.out.println(x);
        if((2 * x + 1) < 20){
            m(2*x+1);
        }

    }
}

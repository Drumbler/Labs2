package TIMUS;

import java.io.IOException;

public class Timus1083 {

    public static void main(String[] args) throws IOException {
        new Timus1083().run();
    }

    public void run() throws IOException {
        int c, n = 0, k = 0, f = 1;

        while ((c = System.in.read()) != ' ') {
            n = n * 10 + c - '0';
        }
        while (System.in.read() == '!') k++;
        while (n > 0) {
            f *= n;
            n -= k;
        }
        System.out.print(f);
    }
}

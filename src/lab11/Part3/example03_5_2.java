package lab11.Part3;

import java.util.LinkedList;
public class example03_5_2 {
    public static void main(String[] args) {
        int n = 10;

        LinkedList<Integer> num = new LinkedList<>();

        for (int i = 1; i < n + 1; i++) {
            num.add(i);
        }

        int i = 0;
        int size = 0;

        while (num.size() > 1){


            if (num.size() % 2 != 0) {

                i = 0;
                size = num.size()/2;

                for (int j = 0; j < size ; j++) {
                    num.remove(i+1);
                    i++;
                }
                num.remove(0);

            }else if (num.size() % 2 == 0) {
                i = 0;
                size = num.size()/2;

                for (int j = 0; j < size ; j++) {
                    num.remove(i+1);
                    i++;

                }
            }
        }
        System.out.println(num.get(0));

    }
}

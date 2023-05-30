package lab11.Part3;

import java.util.HashMap;
import java.util.Map;
public class example03_4 {
    public static void main(String[] args) {
        HashMap<Integer, String> myHashMap = new HashMap<>();

        myHashMap.put(1, "один");
        myHashMap.put(2, "два");
        myHashMap.put(0, "три");
        myHashMap.put(4, "четыре");
        myHashMap.put(5, "пять");
        myHashMap.put(6, "шесть");
        myHashMap.put(7, "семь");
        myHashMap.put(8, "восемь");
        myHashMap.put(9, "девять");
        myHashMap.put(3, "десять");

        int num = 1;
        for (Map.Entry<Integer,String> entry: myHashMap.entrySet()){
            if (entry.getKey() > 5) {
                System.out.println("key > 5 " + ">>> " +  entry.getValue());

            }

            if (entry.getKey() == 0) {
                System.out.println("key = 0 " + ">>> " +  entry.getValue());

            }

            if (entry.getValue().length() > 5) {
                num *= entry.getKey();
            }
        }
        System.out.print(" перемноженое значение ключей, value  которого > 5: >>> " + num);

    }
}
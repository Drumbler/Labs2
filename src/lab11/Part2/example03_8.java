package lab11.Part2;

import lab11.Part2.example03_6.Node;
public class example03_8 {
    public static void main(String[] args) {
        // Добавление элиментов с перемещением головы (наращивание головы)
        Node head = null;
        for (int i = 0; i <= 9; i++){
            head = new Node(i,head);
        }
        // Вывод элиментов на экран
        Node ref = head;
        while (ref != null){
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
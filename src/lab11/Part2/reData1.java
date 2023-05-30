package lab11.Part2;

import lab11.Part2.example03_6.Node;
public class reData1 {
    public static void main(String[] args) {
        // Добавление элиментов с перемещением головы (наращивание головы)
        Node head = null;
        for (int i = 9; i >= 0; i--){
            head = new Node(i,head);
        }

        Node ref;

        // создаем вспомогательную переменную
        ref = head;
// перемещаемся на предпоследний элемент
        while (ref.next.next != null) {
            ref = ref.next;
        }
// полю next предпоследнего элемента присваиваем null
        ref.next=null;
        //Вывод значений на экран
        Node ref2 = head;
        while (ref2 != null){
            System.out.print(" " + ref2.value);
            ref2 = ref2.next;
        }
    }
}
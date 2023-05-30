package lab11.Part2;

public class example03_6 {
    public static class Node{ //КЛАСС - СТРУКТУРА ЭЛЕМЕНТА СПИСКА
        public int value; // значение
        public Node next; // поле - ссылка (указатель) на следующий узел

        Node(int value, Node next){ // конструктор класса
            this.value = value;
            this.next = next;
        }
    }
}

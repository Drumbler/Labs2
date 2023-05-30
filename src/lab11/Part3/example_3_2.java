package lab11.Part3;

public class example_3_2 {
    static class Node
    {
        int value;
        Node next;

        Node(int value, Node next)
        {
            this.value = value;
            this.next = next;
        }
    }
    static class Main {
        public static Node newNode(int key) {
            Node node = new Node(key, null);
            return node;
        }
        public static void printList(Node head) {
            Node ptr = head;
            while (ptr != null) {
                System.out.print(ptr.value + " —> ");
                ptr = ptr.next;
            }

            System.out.println("null");
        }


        public static Node appendNode(Node head, int key) {
            Node current = head;
            Node node = newNode(key);


            if (current == null) {
                head = node;
            } else {

                while (current.next != null) {
                    current = current.next;
                }
                current.next = node;
            }

            return head;
        }

        public static void main(String[] args) {
            // ключи ввода
            int[] keys = {1, 2, 3, 4};


            Node head = null;
            for (int key : keys) {
                head = appendNode(head, key);
            }

            printList(head);
        }
    }
}
package july2019;

public class Partition {

    public class Node {

        public Node() { }

        Node next;
        int data;
    }

    public static void main(String[] args) {


    }

    Node partition(Node head, int partition) {

        if(head == null || head.next == null) {
            return head;
        }

        Node list1 = null, list2 = null;

        while(head != null) {
            Node next = head.next;
            if(head.data < partition) {
                head.next = list1;
                list1 = head;
            } else {
                head.next = list2;
                list2 = head;
            }
            head = next;
        }

        Node current = list1;

        while(current.next != null) {
            current = current.next;
        }

        current.next = list2;

        return list1;
    }
}

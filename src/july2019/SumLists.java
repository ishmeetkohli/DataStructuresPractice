package july2019;
import july2019.Partition.Node;

public class SumLists {

    public static void main(String[] args) {

    }


    static Node sumLists(Node head1, Node head2) {
        if(head1 == null) {
            return head2;
        }

        if(head2 == null) {
            return head1;
        }

        Node result = null;
        int borrow = 0;

        while(head1.next != null || head2.next != null) {
            int num1 = head1.data;
            int num2 = head2.data;

            int sum = num1 + num2 + borrow;
            borrow = sum / 10;

            Node node = new Node();

            node.data = sum % 10;
            node.next = null;

            if(result != null) {
                result.next = node;
            }

            result = node;

        }


        return null;
    }
}

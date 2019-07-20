package problems.stack;

public class MyStack {

    class StackNode {
        private int data;
        private StackNode next;


        public StackNode(int data) {
            this.data = data;
            this.next = null;
        }

        public void setNext(StackNode node) {
            this.next = next;
        }

        public StackNode getNext() {
            return this.next;
        }
    }

    StackNode top;

    public void push(int data) {
        StackNode node = new StackNode(data);
        node.setNext(top);
        top = node;

    }

    public StackNode pop() {

        if(top == null) {
            throw new RuntimeException("Overflow");
        }

        StackNode node = top;
        top = top.getNext();
        return node;
    }


}

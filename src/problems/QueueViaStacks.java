package problems;

import java.util.Stack;

public class QueueViaStacks {

	Stack<Integer> stack1, stack2;

	public QueueViaStacks() {
		stack1 = new Stack<Integer>();
		stack2 = new Stack<Integer>();
	}

	public void insert(int data) {
		stack1.push(data);
	}

	public int delete() {
		while (!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		int result = stack2.pop();
		while (!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
		return result;
	}

}

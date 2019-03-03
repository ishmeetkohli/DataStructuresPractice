package problems;

import java.util.Stack;

public class SortStack {

	Stack<Integer> mainStack, tempStack;

	public SortStack() {
		mainStack = new Stack<Integer>();
		tempStack = new Stack<Integer>();
	}

	public void push(Integer data) {
		int min = mainStack.isEmpty() ? Integer.MAX_VALUE : mainStack.peek();

		if (data > min) {
			while (data > min && !mainStack.isEmpty()) {
				tempStack.push(mainStack.pop());
				if (!mainStack.isEmpty()) {
					min = mainStack.peek();
				}
			}
		}

		mainStack.push(data);

		while (!tempStack.isEmpty()) {
			mainStack.push(tempStack.pop());
		}
	}

	public int pop() {
		return mainStack.pop();
	}

	public int peek() {
		return mainStack.peek();
	}

	public boolean isEmpty() {
		return mainStack.isEmpty();
	}

}

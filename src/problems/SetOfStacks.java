package problems;

import java.util.ArrayList;
import java.util.Stack;

public class SetOfStacks {

	ArrayList<Stack<Integer>> listOfStacks;
	int stackCapacity;
	int head;

	public SetOfStacks(int capacity) {
		this.stackCapacity = capacity;
		listOfStacks = new ArrayList<Stack<Integer>>();
		listOfStacks.add(new Stack<Integer>());
		head = 0;
	}

	public void push(int data) {
		Stack<Integer> stack = listOfStacks.get(head);

		if (stack.size() == stackCapacity) {
			stack = new Stack<Integer>();
			listOfStacks.add(stack);
			head++;
		}

		stack.push(data);
	}

	public int pop() {
		Stack<Integer> stack = listOfStacks.get(head);

		// Check underflow
		if (stack.isEmpty()) {
			return Integer.MAX_VALUE;
		}

		if (stack.size() == 1 && head > 0) {
			head--;
		}
		return stack.pop();
	}

	public int popAt(int index) {
		if (index < 0 || index > head) {
			return Integer.MAX_VALUE;
		}
		
		Stack<Integer> stack = listOfStacks.get(index);

		if (stack == null || stack.isEmpty()) {
			return Integer.MAX_VALUE;
		}

		if (stack.size() == 1 && head > index) {
			listOfStacks.remove(index);
			head--;
		}

		return stack.pop();
	}

}

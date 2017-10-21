package DataStructures;

public class BinaryNodeWithParent {
	int data;
	BinaryNodeWithParent left, right, parent;

	public BinaryNodeWithParent(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public BinaryNodeWithParent getLeft() {
		return left;
	}

	public void setLeft(BinaryNodeWithParent left) {
		this.left = left;
	}

	public BinaryNodeWithParent getRight() {
		return right;
	}

	public void setRight(BinaryNodeWithParent right) {
		this.right = right;
	}

	public BinaryNodeWithParent getParent() {
		return parent;
	}

	public void setParent(BinaryNodeWithParent parent) {
		this.parent = parent;
	}
}

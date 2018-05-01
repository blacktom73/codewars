package main.java.hu.mitro.linkedlist2string;

public class Kata {
	static StringBuilder sb = new StringBuilder();
	static final String ARROW = " -> ";

	public static String stringify(Node list) {
		if (null == list.getNext()) {
			sb.append(list.getData() + ARROW + "null");
		} else {
			sb.append(list.getData() + ARROW);
			stringify(list.getNext());
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Node node1 = new Node(1, new Node(2, new Node(3)));
		System.out.println(stringify(node1));
		Node node2 = new Node(0, new Node(1, new Node(4, new Node(9, new Node(16)))));
		System.out.println(stringify(node2));
	}
}

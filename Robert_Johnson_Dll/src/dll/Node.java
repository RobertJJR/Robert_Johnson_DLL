package dll;

public class Node {
	//The value our Node is going to hold. 
	public Integer value;
	//References the previous node.
	public Node previous;
	//References the next node.
	public Node next;
	
	
	public Node(Integer val) {
		this.value = val;
		this.previous = null;
		this.next = null;
	}
}

package dll;

public class DLL {
	public Node head;
	public Node tail;
	
	public DLL() {
		this.head = null;
		this.tail = null;
	}
	
	// the push method will add a new node to the end of the list
	public void push(Node newNode) {
		// if there is no head in the list, aka, an empty list, we set the newNode to be the head and tail of the list.
		if(this.head == null) {
			this.head = newNode;
			this.tail = newNode;
			return;
		}
		
		//first find the lastNode in the list
		//then, set the lastNOde's next to be the newNode;
		//then, we have to set the previous of the lasNode to the lastNode that we found previously.
		//finally, set the list's tail to be the node that we have added
		Node lastNode = this.tail;
		lastNode.next = newNode;
		newNode.previous = lastNode;
		this.tail = newNode;
	}
	
	
	public void printValuesForward() {
		//find the first node, aka head.
		Node current = this.head;
		
		//while the current node exists...
		while(current != null) {
			//print it's value
			System.out.println(current.value);
			//and move on to its next node.
			current = current.next;
		}
	}
	
	public void printValuesBackwards() {
		//find the last node, aka tail.
		Node current = this.tail;
		
		while(current != null) {
			System.out.println(current.value);
			current = current.previous;
		}
	}
	
	public Node pop() {
		if(this.tail == null) {
			return null;
		}
		else
		{
			//Node tail will now be whaterver the current node is.
			Node tail = this.tail;
			//Last node is going to hold the previous node so when tail is popped we still have the last value as the node.
			Node lastNode = this.tail.previous;
			lastNode.next = null;
			this.tail = lastNode;
			
			return tail;
		}
		
	}

	public boolean contains(int value) {
		// Find the first node.
		Node current = this.head;
		
		// While current exists
		while(current != null) {
			// If value is equal to this.value, return true
			if(current.value == value) {
				return true;
			}
			// 'Iterate' to next node
			current = current.next;
		}
		// if loop completes without returning true, return false
		return false;
	}
	public int size() {
		// Checks to see if there is a head
		int counter = 0;
		if(this.head == null) {
			return counter;
		// If there is a head, proceed to count
		} else {
			// Find the first node.
			Node current = this.head;
			
			// While current exists
			while(current != null) {
				// add to counter and 'iterate' to next node
				counter++;
				current = current.next;
			}
			return counter;
		}
	}
	
}
//void printValuesBackwards(): This method prints the values of nodes from tail to head
//Node pop(): This method removes the last node of our DLL and returns it.
//boolean contains(Integer value): This method returns a boolean whether the value in the argument is in the list or not. Return true if the value exists.
//int size(): Returns the number of nodes in the list

//CHALLENGES

//void insertAt (Node newNode, int index): Inserts a node at a specific index. Ex: If we have 3 nodes, we call insertAt(newNode, 1), the newNode should be inserted right after the head. (Head is index 0)
//void removeAt(int index): This method removes a node at an index. For example, lets say that we have 3 nodes in our list. If we call removeAt(1), the middle node is removed.
//boolean isPalindrome(): This method returns a boolean whether the node is a palindrome or not. Return true if it is a palindrome, else, return false.

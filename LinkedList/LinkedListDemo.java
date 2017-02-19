public class LinkedListDemo {
	public static void main(String[] args) {
		Node head = null;
		Node tail = null;
	       		
		/*Add first node
		 *Special case bc only time head is changed
		 */
		temp = new Node();
		temp.data(2);
		temp.next = null;
		
		head = temp;
		tail = temp;
		
		//Add the second node
		temp = new Node(); 
		temp.data=42; //Store 42 in the node
		temp.next = null; //Store null in the node address

		tail.next = temp;
		tail = temp;	
		
		//Add the third node
		temp = new Node();
		temp data = 7; //Store 7 in this node
		temp.next = null ;//Store null in the node address
		tail.next = temp; //
		tail = temp;//Points to '7' the new tail by taking new address and store

		print("The Contents of the Linked List:");
		temp = head;

		while(temp != null) {
			print(temp.data);
			temp = temp.next;
		}


	}
}
public class Node {
	public int data;
	public Node next;
}

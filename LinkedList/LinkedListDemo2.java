import java.util.Scanner;

public class LinkedListDemo2 {
	public static void main(String[] args) {
		int entry;
		Scanner scanner = new Scanner(System.in);
		Node head;
		Node tail;
		Node temp;
		head = null;
		tail = null;

		print("Enter first Number:");
		entry = scanner.nextInt();

		while(entry != 0) {
			temp = new Node();
			temp.data = entry;
			temp.next = null;
			if(head == null) {
				head = temp;
			}
			else { 
				tail.next - temp;
			}

			printf("Enter first number:");
			entry = scanner.nextInt();
		}

}

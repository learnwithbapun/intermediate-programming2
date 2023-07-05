package linkedlist56;


/* create a LL of n nodes [values 1 to n ]. Return the head node (n > 0)
 */
public class LessonQuestion1 {

	public static void main(String[] args) {
		Node abc = createLL(7);

		while (abc != null) {
			System.out.print(abc.data + " ");
			abc = abc.next;
		}
	}

	public static Node createLL(int n) {
		Node head = new Node(0);
		Node tail = head;
		for (int i = 1; i <= n; i++) {

			tail.next = new Node(i);
			tail = tail.next;
		}
		return head;
	}

}

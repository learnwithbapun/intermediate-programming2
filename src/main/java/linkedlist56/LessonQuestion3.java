package linkedlist56;


/*
 * GIVEN a LL , insert a new node with data v at position p.
 * 
 */
public class LessonQuestion3 {

	public static void main(String[] args) {
	}

	public static Node insertInLL(Node head, int v, int p) {

		if (p == 0) {
			Node z = new Node(v);
			z.next = head;
			head = z;
			return head;

		} else {

			Node tail = head;
			Node z = new Node(v);
			for (int i = 0; i < p - 1; i++) {
				tail = tail.next;
			}
			Node y = tail.next;
			tail.next = z;
			z.next = y;

			return head;
		}

	}

}

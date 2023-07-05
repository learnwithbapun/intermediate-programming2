package linkedlist56;


/*
 * GIVEN the head of the LL return the size of the LL.
 * 
 */
public class LessonQuestion2 {

	public static void main(String[] args) {
	}

	public static int sizeOfLL(Node head) {

		Node tail = head;
		int count = 0;
		while (tail != null) {
			count++;
			tail = tail.next;

		}

		return count;
	}

}

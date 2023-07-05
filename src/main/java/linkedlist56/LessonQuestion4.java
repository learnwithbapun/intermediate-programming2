package linkedlist56;


/*
 * GIVEN a LL , print its reverse.
 * 
 * 
 */
public class LessonQuestion4 {

	 public void solve(Node A) {
		    helper(A);
		    System.out.println();
		    }

		 public void helper(Node A) {
		    if(A == null){
		    return;
		}
		        helper(A.next);
		        System.out.print(A.data+" ");
		        
		    }
		}


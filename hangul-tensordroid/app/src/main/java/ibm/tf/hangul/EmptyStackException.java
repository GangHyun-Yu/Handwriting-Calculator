package ibm.tf.hangul;

public class EmptyStackException extends RuntimeException {
	   public EmptyStackException()   {
	      super ("The stack is empty.");
	   }

	   public EmptyStackException (String message)   {
	      super (message);
	   }
	}

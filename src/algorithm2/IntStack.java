package algorithm2;

public class IntStack {

		int[] stk;
		int capacity;
		int ptr;
		
		public class EmptyIntStachException extends RuntimeException {
			public EmptyIntStachException() {}
		}
		
		public class OverflowIntStackException extends RuntimeException {
			public OverflowIntStackException() {}
		}
		
		public IntStack(int maxlen) {
			ptr = 0;
			capacity = maxlen;
			try {
				stk = new int[capacity];
			} catch (OutOfMemoryError e) {
				capacity = 0;
			}
		}

}

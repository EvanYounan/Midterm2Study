package w7lab;

public class UnfairWaitList<E> extends WaitList<E> {


	public void remove(E element) {
		if (this.contains(element)) {
			this.content.remove(element);
		}
	}
	
	public void moveToBack(E element) {
		remove(element);
		content.add(element);
	}
} 

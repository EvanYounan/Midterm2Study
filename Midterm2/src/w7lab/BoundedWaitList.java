package w7lab;

public class BoundedWaitList<E> extends WaitList<E> {

	private int capacity;
	
	
	public BoundedWaitList (int capacity) {
		this.capacity = capacity;
	}
	
	public int getCapacity() {
		return this.capacity;
	}
	
	public void add(E element) {
		if (content.size() < this.capacity)
			super.add(element);
	}
}

package w7lab;

import java.util.Collection;

public interface IWaitList<E> {
	
	public E remove();
	
	public boolean contains(E element);
	
	public boolean containsAll(Collection<E> c);
	
	public boolean isEmpty();

	public void add(E element);
}
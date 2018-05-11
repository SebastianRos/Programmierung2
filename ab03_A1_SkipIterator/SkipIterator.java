package ab03_A1_SkipIterator;

import java.util.Iterator;

public class SkipIterator<T> implements Iterator<T> {
	
	Iterator<T> i;

	public SkipIterator(Iterator<T> pI) {
		i = pI;
		if (i.hasNext()) {i.next();}
	}
	
	public boolean hasNext() {
		return i.hasNext();
	}

	public T next() {
		T retval = i.next();
		if (i.hasNext()) {i.next();}
		return retval;
	}
	
	
}

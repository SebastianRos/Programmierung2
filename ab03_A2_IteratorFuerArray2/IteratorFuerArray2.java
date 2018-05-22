package ab03_A2_IteratorFuerArray2;

/**
 * @author srasau2s
 */

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorFuerArray2<T> implements Iterator<T>{
	
	private T[][] a;
	private boolean hasNext = true;
	private boolean istZeilenweise = true;
	private int richtung = 0;
	private int zStart = -1;
	private int sStart = -1;
	private int posZ = -1;
	private int posS = -1;

	public IteratorFuerArray2(T[][] pA) {
		this(pA, true);
		a = pA;
	}
	public IteratorFuerArray2(T[][] pA, boolean pZeile) {
		this(pA, pZeile, true);
		istZeilenweise = pZeile;
	}
	public IteratorFuerArray2(T[][] pA, boolean pZeile, boolean pVorwaerts) {
		this(pA, pZeile, pVorwaerts, 0, 0);
	}
	public IteratorFuerArray2(T[][] pA, boolean pZeile, boolean pVorwaerts, int pZ, int pS) {
		a = pA;
		istZeilenweise = pZeile;
		posZ = pZ;
		posS = pS;
		if (pVorwaerts) {
			richtung = 1;
		} else {
			richtung = -1;
			next();
		}
		zStart = posZ;
		sStart = posS;
	}
	
	public boolean hasNext() {
		return hasNext;
	}
	public T next() {
		if (!hasNext()){
			throw new NoSuchElementException();
		}
		T retval = a[posZ][posS];
		if (istZeilenweise){
			posS += richtung;
		} else {
			posZ += richtung;
		}
		clamp();
		hasNext = ((posS == sStart) && (posZ == zStart)) ? false : true;
		return retval;
	}

	private void clamp(){
		if ((posS + posZ) >= (a[0].length + a.length-1)){
			posS = 0;
			posZ = 0;
		} else if (posS + posZ <= -1){
			posS = a[0].length-1;
			posZ = a.length-1;
		}
		if (posZ >= a.length){
			posZ = 0;
			posS++;
		} else if (posZ < 0){
			posZ = a.length-1;
			posS--;
		}
		if (posS >= a[0].length){
			posS = 0;
			posZ++;
			clamp();
		} else if (posS < 0){
			posS = a[0].length-1;
			posZ--;
			clamp();
		}
	}
}

/**
 * @author srasau2s
 */
package ab03_A2_IteratorFuerArray2;

import java.util.Iterator;

public class IteratorFuerArray2<T> implements Iterator<T>{
	
	T[][] a;
	boolean hasNext = true;
	boolean istZeilenweise = true;
	int richtung = 0;
	int zStart = -1;
	int sStart = -1;
	int posZ = -1;
	int posS = -1;
	
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
		T retval = a[posZ][posS];
		if (istZeilenweise) {
			posS = (posS + richtung);
			if (posS >= a.length) {
				posS = 0;
				posZ++;
			} else if (posS < 0) {
				posS = a.length-1;
				posZ--;
			}
			if (posZ >= a.length) {
				posZ = 0;
			} else if (posZ < 0) {
				posZ = a.length-1;
			}			
		} else {
			posZ = (posZ + richtung);
			if (posZ >= a.length) {
				posZ = 0;
				posS++;
			} else if (posZ < 0) {
				posZ = a.length-1;
				posS--;
			}
			if (posS >= a.length) {
				posS = 0;
			} else if (posS < 0) {
				posS = a.length-1;
			}
		}
		hasNext = ((posS == sStart) && (posZ == zStart)) ? false : true;
		return retval;
	}
}

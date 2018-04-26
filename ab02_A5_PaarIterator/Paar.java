/**
 * @author srosau2s
 */

package ab02_A5_PaarIterator;

public class Paar<E, Z> {

	private E erstes;
	private Z zweites;
	
	public Paar(E pE, Z pZ) {
		erstes = pE;
		zweites = pZ;		
	}
	
	public E erstes() {
		return erstes;
	}
	public Z zweites() {
		return zweites;
	}
	
	public E setErstes(E e) {
		E tmp = erstes;
		erstes = e;
		return tmp;
	}
	public Z setZweites(Z z) {
		Z tmp = zweites;
		zweites = z;
		return tmp;
	}
	
	public boolean equals(Paar<E,Z> p) {
		if (erstes == null) {
			if (p.erstes != null) {
				return false;
			}
		} else {
			if (!erstes.equals(p.erstes)){
				return false;
			}
		}
		if (zweites == null) {
			if (p.zweites != null) {
				return false;
			}
		} else {
			if (!zweites.equals(p.zweites)) {
				return false;
			}
		}
		
		return true;
	}
	
	public String toString() {
		return "(" + erstes + "," + zweites + ")";
	}
}

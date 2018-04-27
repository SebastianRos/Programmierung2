/**
 * @author srosau2s
 */

package ab02_A5_PaarIterator;

public class IndexedPVonPaar<E,Z> implements IndexedP<Paar<E, Z>> {
	private IndexedP<E> e;
	private IndexedP<Z> z;
	
	public static void main(String[] args) {
		IndexedPFix<String> bananeE = new IndexedPFix<>(3);
		bananeE.set(0, "Null");
		bananeE.set(1, "Null");
		bananeE.set(2, "Null");
		IndexedPFix<String> bananeZ = new IndexedPFix<>(4);
		bananeZ.set(0, "Null");
		bananeZ.set(1, "Null");
		bananeZ.set(2, "Null");
		bananeZ.set(3, "Null");
		
		IndexedPVonPaar<String, String> banane = new IndexedPVonPaar<>(bananeE, bananeZ);
		System.out.println(bananeE.equals(bananeZ));
	}
	
	public IndexedPVonPaar(IndexedP<E> pE, IndexedP<Z> pZ){
		e = pE;
		z = pZ;
	}
	
	public boolean isEmpty() {
		return (size() == 0);
	}
	public int size(){
		return (e.size() <= z.size() ? e.size() : z.size());
	}
	
	public Paar<E, Z> get(int p){
		return new Paar<>(e.get(p), z.get(p));
	}
	public Paar<E, Z> set(int p, Paar<E, Z> v){
		return new Paar<>(e.set(p, v.erstes()), z.set(p, v.zweites()));
	}
	public void swap(int p, int q) {
		e.swap(p,q);
		z.swap(p, q);
	}
	protected Paar<IndexedP<E>, IndexedP<Z>> paarVonIndexedP(){
		return new Paar<>(e, z);
	}

	public String toString() {
		String output = "";
		for (int i = 0; i < size(); i++) {
			output += "(" + e.get(i) + "," + z.get(i) + ")\n";
		}
		return output;
	}
}

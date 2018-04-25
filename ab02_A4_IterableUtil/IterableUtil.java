package ab02_A4_IterableUtil;
import java.util.*;

import aB02_A3_IteratorKaffee.FeldPFix;

public class IterableUtil {

	public static void main(String[] args) {
		FeldPFix<String> feld = new FeldPFix<String>(4);
		feld.set(0, "d");
		feld.set(1, "c");
		feld.set(2, "a");
		feld.set(3, "b");
		Iterable<String> feldi = new Iterable<String>(){
			public Iterator<String> iterator() {
				return feld.iterator();
			}
		};
		Comparator<String> comp = new CompString();
		System.out.println(max2(feldi, comp));
	}
	
	public static <T> T max2(Iterable<T> folge, Comparator<T> comp){
		Iterator<T> iterator = folge.iterator();
		T groesstes = iterator.next();
		T zweites = iterator.next();
		if (comp.compare(groesstes, zweites) > 0) {
			T tmp = groesstes;
			groesstes = zweites;
			zweites = tmp;
		}
		while (iterator.hasNext()) {
			T akt = iterator.next();
			if (comp.compare(groesstes, akt) > 0) {
				zweites = groesstes;
				groesstes = akt;
			} else if (comp.compare(zweites, akt) > 0) {
				zweites = akt;
			}
		}
		return zweites;
	}
}

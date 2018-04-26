/**
 * @author srosau2s
 */
package ab02_A4_IterableUtil;
import java.util.*;
import aB02_A3_IteratorKaffee.FeldPFix;

public class IterableUtil {

	public static void main(String[] args) {
		FeldPFix<String> feld = new FeldPFix<String>(12);
		feld.set(0, "Hallo");
		feld.set(1, "ROLFKOPTER");
		feld.set(2, "ICH HAB KEINE HOSE AN");
		feld.set(3, "DIE WURZel aus 1 is 1");
        feld.set(4, "Perter");
        feld.set(5, "Berta");
        feld.set(6, "Zoran");
        feld.set(7, "Zulpich");
        feld.set(8, "Aaab");
        feld.set(9, "Grank");
        feld.set(10, "aalsjgaopibn");
        feld.set(11, "HAI");
		Comparator<String> comp = new CompString();
		System.out.println(max2(feld, comp));
	}
	
	public static <T> T max2(Iterable<T> folge, Comparator<T> comp){
		Iterator<T> iterator = folge.iterator();
		T groesstes = iterator.next();
		T zweites = iterator.next();
		if (comp.compare(zweites, groesstes) > 0) {
			T tmp = groesstes;
			groesstes = zweites;
			zweites = tmp;
		}
		while (iterator.hasNext()) {
			T akt = iterator.next();
			if (comp.compare(akt, groesstes) > 0) {
				zweites = groesstes;
				groesstes = akt;
			} else if (comp.compare(akt, zweites) > 0){
			    zweites = akt;
            }
		}
		return zweites;
	}
}

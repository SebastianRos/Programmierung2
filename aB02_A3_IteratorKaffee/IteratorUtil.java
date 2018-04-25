package aB02_A3_IteratorKaffee;

import java.util.Iterator;

public class IteratorUtil {
	
	public static void main(String[] arg) {
		FeldPFix<String> feld = new FeldPFix<String>(4);
		feld.set(0, "deine Mudda");
		feld.set(1, "die Katze");
		feld.set(2, "den Hund");
		feld.set(3, "ein Regal");
		Iterator<String> i = feld.iterator();
		System.out.println(toString(i, "In der Tierhandlung tut ", " tretet ", " um."));
	}
	
	public static <T> String toString(Iterator<T> i, String a, String z, String e) {
		String result = a + i.next();
		while (i.hasNext()) {
			result += z + i.next();
		}
		result += e;
		return result;
	}
}

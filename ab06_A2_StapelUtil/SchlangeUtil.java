package ab06_A2_StapelUtil;

public class SchlangeUtil {
	
	<T> int sitze(Schlange<T> w) {
		int count = 0;
		Schlange<T> tmp = new SchlangeAlsFeldDyn<>();
		while (!w.isEmpty()) {
			tmp.insert(w.remove());
			count++;
		}
		while (!tmp.isEmpty()) {
			w.insert(tmp.remove());
		}
		return count;
	}
	
	<T> void revert(Schlange<T> w) {
		Stapel<T> tmp = new StapelAlsFeldDyn<>();
		while (!w.isEmpty()) {
			tmp.insert(w.remove());
		}
		while (!tmp.isEmpty()) {
			w.insert(tmp.remove());
		}
	}
	
	<T> void append(Schlange<? super T> ziel, Schlange<? extends T> quelle) {
		while (!quelle.isEmpty()) {
			ziel.insert(quelle.remove());
		}
	}
}

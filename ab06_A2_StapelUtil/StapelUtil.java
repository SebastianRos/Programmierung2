package ab06_A2_StapelUtil;

public class StapelUtil {
	
	<T> int sitze(Stapel<T> s) {
		int count = 0;
		Stapel<T> tmp = new StapelAlsFeldDyn<>();
		while (!s.isEmpty()) {
			tmp.insert(s.remove());
			count++;
		}
		while (!tmp.isEmpty()) {
			s.insert(tmp.remove());
		}
		return count;
	}
	
	<T> void revert(Stapel<T> s) {
		Schlange<T> tmp = new SchlangeAlsFeldDyn<>();
		while(!s.isEmpty()) {
			tmp.insert(s.remove());
		}
		while(!tmp.isEmpty()) {
			s.insert(s.remove());
		}
	}
	
	<T> void append(Stapel<T> ziel, Stapel<T> quelle) {
		revert(quelle);
		while(!quelle.isEmpty()) {
			ziel.insert(quelle.remove());
		}
	}
}

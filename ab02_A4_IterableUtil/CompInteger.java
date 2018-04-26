package ab02_A4_IterableUtil;

import java.util.Comparator;

public class CompInteger implements Comparator<Integer> {
	public int compare(Integer i1, Integer i2) {
		return i1.compareTo(i2);
	}
}

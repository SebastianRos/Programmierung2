/**
 * @author srosau2s
 */
package ab05_A3_CompComparable;

public class CompComparable <T extends Comparable> implements java.util.Comparator<T> {

    public int compare(T o1, T o2) {
        return o1.compareTo(o2);
    }
}

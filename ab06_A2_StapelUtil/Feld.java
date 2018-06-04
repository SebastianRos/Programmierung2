/**
 * @author apries2m
 */
package ab06_A2_StapelUtil;

public interface Feld<T> extends Indexed<T>, Iterable<T> {
  java.util.Iterator<T> iterator(Integer p);
  java.util.Iterator<T> iterator(Integer p, Integer e);
}

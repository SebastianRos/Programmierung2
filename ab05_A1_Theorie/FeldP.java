/**
 * @author apries2m
 */
package ab05_A1_Theorie;
public interface FeldP<T>
extends IndexedP<T>, Iterable<T> {
  java.util.Iterator<T> iterator(int p);
  java.util.Iterator<T> iterator(int p, int e);
}

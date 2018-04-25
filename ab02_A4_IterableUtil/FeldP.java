/**
 * @author apries2m
 */
package ab02_A4_IterableUtil;
public interface FeldP<T>
extends IndexedP<T>, Iterable<T> {
  java.util.Iterator<T> iterator(int p);
  java.util.Iterator<T> iterator(int p, int e);
}

package ab02_A5_PaarIterator;

/**
 * @author apries2m
 */
public interface FeldP<T>
extends IndexedP<T>, Iterable<T> {
  java.util.Iterator<T> iterator(int p);
  java.util.Iterator<T> iterator(int p, int e);
}

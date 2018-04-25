/**
 * @author apries2m
 */
package aB02_A3_IteratorKaffee;
public interface FeldP<T>
extends IndexedP<T>, Iterable<T> {
  java.util.Iterator<T> iterator(int p);
  java.util.Iterator<T> iterator(int p, int e);
}

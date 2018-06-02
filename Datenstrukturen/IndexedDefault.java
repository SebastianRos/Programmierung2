package Datenstrukturen;

/**
 * @author apries2m
 */
public interface IndexedDefault<T>
extends Indexed<T> {
  default void checkKey(Integer p) {
    if (!(0 <= p && p < size())) {
      throw new IndexOutOfBoundsException();
    }    
  }
  default boolean isEmpty() {
    return size() == 0;
  }
  default void swap(Integer p, Integer q) {
    if (p != q) {
      set(q, set(p, get(q)));
    }
  }
}

package Datenstrukturen;

/**
 * @author apries2m
 */
public interface ListeDefault<T>
extends Liste<T> {
  default T getFirst() {
    try {
      return get(0);
    }
    catch (IndexOutOfBoundsException x) {
      throw new java.util.NoSuchElementException();
    }
  }
  default T getLast() {
    try {
      return get(size() - 1);
    }
    catch (IndexOutOfBoundsException x) {
      throw new java.util.NoSuchElementException();
    }
  }
  default T setFirst(T v) {
    try {
      return set(0, v);
    }
    catch (IndexOutOfBoundsException x) {
      throw new java.util.NoSuchElementException();
    }
  }
  default T setLast(T v) {
    try {
      return set(size() - 1, v);
    }
    catch (IndexOutOfBoundsException x) {
      throw new java.util.NoSuchElementException();
    }
  }
}

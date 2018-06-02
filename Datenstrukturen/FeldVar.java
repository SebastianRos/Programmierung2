package Datenstrukturen;

/**
 * @author apries2m
 */
public class FeldVar<T>
extends FeldAbstrakt<T>
implements FeldDefaultFuerIndexed<T> {
  private static final int MAX_SIZE = 8;
  private final Feld<T> f = new FeldFix<T>(MAX_SIZE);
  private int size;
  public int total() {
    return 2 + f.size();
  }
  public int size() {
    return size;
  }
  public T get(Integer p) {
    checkKey(p);
    return f.get(p);
  }
  public T set(Integer p, T v) {
    checkKey(p);
    return f.set(p, v);
  }
  public void insertLast(T v) {
    if (size == f.size()) {
      throw new IllegalStateException();
    }
    f.set(size++, v);
  }
  public T removeLast() {
    if (size() == 0) {
      throw new java.util.NoSuchElementException();
    }
    return f.get(--size);
  }
}

package Datenstrukturen;

/**
 * @author apries2m
 */
public class StapelAlsFeldDyn<T> implements Stapel<T> {
  private FeldDyn<T> f = new FeldDyn<T>();
  public int total() {
    return 1 + f.total();
  }
  public boolean isEmpty() {
    return f.isEmpty();
  }
  public void insert(T v) {
    f.insertLast(v);
  }
  public T element() {
    try {
      return f.get(f.size() - 1);
    }
    catch (IndexOutOfBoundsException x) {
      throw new java.util.NoSuchElementException();
    }
  }
  public T remove() {
    return f.removeLast();
  }
}

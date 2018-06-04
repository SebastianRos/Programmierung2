/**
 * @author apries2m
 */
package ab06_A2_StapelUtil;

public class SchlangeAlsFeldDyn<T> implements Schlange<T> {
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
      return f.get(0);
    }
    catch (IndexOutOfBoundsException x) {
      throw new java.util.NoSuchElementException();
    }
  }
  public T remove() {
    T v = element();
    for (int i = 0; i < f.size() - 1; ++i) {
      f.set(i, f.get(i + 1));
    }
    f.removeLast();
    return v;
  }
}

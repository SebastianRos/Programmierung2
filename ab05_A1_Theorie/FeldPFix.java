/**
 * @author apries2m
 */
package ab05_A1_Theorie;
public class FeldPFix<T>
extends IndexedPFix<T> implements FeldP<T> {
  public class Iterator
  implements java.util.Iterator<T> {
    private int p; // aktuelle Position
    private int e; // Endposition
    private Iterator() {
      this(0);
    }
    private Iterator(int p) {
      this(p, size());
    }
    private Iterator(int p, int e) {
      if (!(0 <= p && p <= e && e <= size())) {
        throw new IndexOutOfBoundsException();
      }
      this.p = p;
      this.e = e;
    }
    public boolean hasNext() {
      return p < e;
    }
    public T next() {
      try {
        return get(p++);
      }
      catch (IndexOutOfBoundsException x) {
        throw new java.util.NoSuchElementException();
      }
    }
  }
  public FeldPFix(int size) {
    super(size);
  }
  public Iterator iterator() {
    return new Iterator();
  }
  public Iterator iterator(int p) {
    return new Iterator(p);
  }
  public Iterator iterator(int p, int e) {
    return new Iterator(p, e);
  }
}

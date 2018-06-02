package Datenstrukturen;

/**
 * @author apries2m
 */
public interface FeldDefaultFuerIndexed<T>
extends Feld<T>, IndexedDefault<T> {
  // kann nicht als innere Klasse deklariert werden,
  // da in einer Schnittstelle
  public static class Iterator<U>
  implements java.util.Iterator<U> {
    private FeldDefaultFuerIndexed<U> f;
    private int p; // aktuelle Position
    private int e; // Endposition
    private Iterator(FeldDefaultFuerIndexed<U> f) {
      this(f, 0);
    }
    private Iterator(FeldDefaultFuerIndexed<U> f, int p) {
      this(f, p, f.size());
    }
    private Iterator(FeldDefaultFuerIndexed<U> f, int p, int e) {
      if (!(0 <= p && p <= e && e <= f.size())) {
        throw new IndexOutOfBoundsException();
      }
      this.f = f;
      this.p = p;
      this.e = e;
    }
    public boolean hasNext() {
      return p < e;
    }
    public U next() {
      if (hasNext()) {
        try {
          return f.get(p++);
        }
        catch (IndexOutOfBoundsException x) {
        }
      }
      throw new java.util.NoSuchElementException();
    }
  }
  default Iterator<T> iterator() {
    return new Iterator<T>(this);
  }
  default Iterator<T> iterator(Integer p) {
    return new Iterator<T>(this, p);
  }
  default Iterator<T> iterator(Integer p, Integer e) {
    return new Iterator<T>(this, p, e);
  }
}

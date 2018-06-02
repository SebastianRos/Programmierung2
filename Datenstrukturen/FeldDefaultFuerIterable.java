package Datenstrukturen;

/**
 * @author apries2m
 */
public interface FeldDefaultFuerIterable<T>
extends Feld<T> {
  // kann nicht als innere Klasse deklariert werden,
  // da in einer Schnittstelle
  public static class Iterator<U>
  implements java.util.Iterator<U> {
    private java.util.Iterator<U> i;
    private int r; // Anz. restliche Elemente
    private Iterator(Iterable<U> ii) {
      this(ii, 0);
    }
    private Iterator(Iterable<U> ii, int p) {
      this(ii, p, Integer.MAX_VALUE);
    }
    private Iterator(Iterable<U> ii, int p, int e) {
      this.i = ii.iterator();
      r = e - p;
      for (int pp = 0; pp < p; ++pp) { // while (p-- > 0)
        if (!i.hasNext()) {
          throw new IndexOutOfBoundsException();
        }
        i.next();
      }
    }
    public boolean hasNext() {
      return i.hasNext() && r > 0;
    }
    public U next() {
      if (!hasNext()) {
        throw new java.util.NoSuchElementException();
      }
      --r;
      return i.next();
    }
  }
  default Iterator<T> iterator(Integer p) {
    return new Iterator<T>(this, p);
  }
  default Iterator<T> iterator(Integer p, Integer e) {
    return new Iterator<T>(this, p, e);
  }
}

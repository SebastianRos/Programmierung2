package Datenstrukturen;

/**
 * @author apries2m
*/
public class ListeAlsRingDyn<T>
extends ListeAbstrakt<T>
implements FeldDefaultFuerIndexed<T>, ListeDefault<T> {
  private RingDyn<T> r = new RingDyn<T>();
  public int total() {
    return 1 + r.total();
  }
  public int size() {
    return r.size();
  }
  public void insertFirst(T v) {
    r.insertFirst(v);
  }
  public void insertLast(T v) {
    r.insertLast(v);
  }
  // in der Vorlesung gezeigte Fassung - nicht aufgeteilt
  /*
  void insert(Integer p, T v) {
    // IndexOutOfBoundsException fuer p < 0 oder p > size()
    r.insertLast(null); // r ist verwendeter Ringpuffer
    for (int i = r.size() - 1; i > p; --i) {
      r.set(i, r.get(i - 1)); // Verschieben ab p nach rechts
    }
    r.set(p, v);
  }
  */
  private void moveL(int von, int bis) {
    // als Uebungsaufgabe zu implementieren
    throw new UnsupportedOperationException();
  }
  private void moveR(int von, int bis) {
    // als Uebungsaufgabe zu implementieren
    throw new UnsupportedOperationException();
  }
  public void insert(Integer p, T v) {
    if (p < size() - p) {
      r.insertFirst(null);
      moveL(0, p);
    }
    else {
      r.insertLast(null);
      moveR(p, r.size() - 1);
    }
    r.set(p, v);
  }
  public T get(Integer p) {
    return r.get(p);
  }
  public T set(Integer p, T v) {
    return r.set(p, v);
  }
  public T removeFirst() {
    return r.removeFirst();
  }
  public T removeLast() {
    return r.removeLast();
  }
  public T remove(Integer p) {
    // als Uebungsaufgabe zu implementieren
    throw new UnsupportedOperationException();
  }
}

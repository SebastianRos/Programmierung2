package Datenstrukturen;

/**
 * @author apries2m
*/
public class RingDyn<T> extends FeldAbstrakt<T>
implements FeldDefaultFuerIndexed<T> {
  private Feld<T> f = new FeldFix<T>(1);
  private int size;
  private int a;
  public int total() {
    return 3 + f.size();
  }
  public int size() {
    return size;
  }
  public T get(Integer p) {
    checkKey(p);
    return f.get((a+p) % f.size());
  }
  public T set(Integer p, T v) {
    checkKey(p);
    return f.set((a+p) % f.size(), v);
  }
  /*
   * legt ein neues Feld an, uebertraegt die Eintraege des Ringpuffers in das neue Feld,
   * beginnend bei dessen Anfang
   *
   * @param s Groesse des neuen Feldes
   */
  private void adjust(int s) {
    // als Uebungsaufgabe zu implementieren
    throw new UnsupportedOperationException();
  }
  /*
   * passt, falls notwendig, die Feldgroesse an, um eine Einfuegung durchfuehren zu koennen
   */
  private void adjustInsert() {
    // als Uebungsaufgabe zu implementieren
    throw new UnsupportedOperationException();
  }
  /*
   * passt, falls notwendig, nach einer Loeschung die Feldgroesse an
   */
  private void adjustRemove() {
    // als Uebungsaufgabe zu implementieren
    throw new UnsupportedOperationException();
  }
  public void insertFirst(T v) {
    adjustInsert();
    a = (a - 1 + f.size()) % f.size();
    ++size;
    set(0, v);
  }
  public void insertLast(T v) {
    adjustInsert();
    ++size;
    set(size - 1, v);
  }
  public T removeFirst() {
    if (size == 0) {
      throw new java.util.NoSuchElementException();
    }
    T v = get(0);
    a = (a + 1) % f.size();
    --size;
    adjustRemove();
    return v;
  }
  public T removeLast() {
    if (size == 0) {
      throw new java.util.NoSuchElementException();
    }
    T v = get(size - 1);
    --size;
    adjustRemove();
    return v;
  }
}

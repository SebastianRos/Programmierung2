package Datenstrukturen;

/**
 * @author apries2m
 */
// eigentlich werden alle Deklarationen bereits geerbt,
// werden hier aber zur Verdeutlichung wiederholt und kommentiert
public interface Liste<T> extends ZuordnungDyn<Integer,T>, Deque<T>, Feld<T> {
  /**
   * @throws IndexOutOfBoundsException falls Position p ungueltig
   */
  void insert(Integer p, T v);
  /**
   * @return vorheriges Element an Position p
   * @throws IndexOutOfBoundsException falls Position p ungueltig
   */
  T remove(Integer p);
}

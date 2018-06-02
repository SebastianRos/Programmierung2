package Datenstrukturen;

/**
 * @author apries2m
 */
// eigentlich werden alle Deklarationen bereits geerbt,
// werden hier aber zur Verdeutlichung wiederholt und kommentiert
public interface Indexed<T> extends Sequenz<T>, Zuordnung<Integer,T> {
  int size();
  /**
   * @return Element an Position p
   * @throws IndexOutOfBoundsException falls p ungueltig
   */
  T get(Integer p);
  /**
   * @return vorheriges Element an Position p
   * @throws IndexOutOfBoundsException falls p ungueltig
   */
  T set(Integer p, T v);
  /**
   * @throws IndexOutOfBoundsException falls p oder q ungueltig
   */
  void swap(Integer p, Integer q);
}

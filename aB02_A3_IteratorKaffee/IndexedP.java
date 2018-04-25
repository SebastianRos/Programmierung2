/**
 * @author apries2m
 */
package aB02_A3_IteratorKaffee;
public interface IndexedP<T> {
  boolean isEmpty();
  int size();
  /**
   * @return Element an Position p
   * @throws IndexOutOfBoundsException falls p ungueltig
   */
  T get(int p);
  /**
   * @return vorheriges Element an Position p
   * @throws IndexOutOfBoundsException falls p ungueltig
   */
  T set(int p, T v);
  /**
   * @throws IndexOutOfBoundsException falls p oder q ungueltig
   */
  void swap(int p, int q);
}

package Datenstrukturen;

/**
 * @author apries2m
 */
public interface Menge<T> extends Kollektion<T> {
  int size();
  boolean contains(T v);
  T element();
}

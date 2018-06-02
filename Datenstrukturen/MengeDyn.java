package Datenstrukturen;

/**
 * @author apries2m
 */
public interface MengeDyn<T> extends Menge<T> {
  boolean insert(T v);
  boolean remove(T v);
}

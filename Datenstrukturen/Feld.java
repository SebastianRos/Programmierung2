package Datenstrukturen;

/**
 * @author apries2m
 */
public interface Feld<T> extends Indexed<T>, Iterable<T> {
  java.util.Iterator<T> iterator(Integer p);
  java.util.Iterator<T> iterator(Integer p, Integer e);
}

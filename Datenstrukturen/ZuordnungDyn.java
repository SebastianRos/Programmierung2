package Datenstrukturen;

/**
 * @author apries2m
 */
public interface ZuordnungDyn<K,T> extends Zuordnung<K,T> {
  void insert(K k, T v);
  T remove(K k);
}

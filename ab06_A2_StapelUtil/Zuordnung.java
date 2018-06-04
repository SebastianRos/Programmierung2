/**
 * @author apries2m
 */
 package ab06_A2_StapelUtil;

public interface Zuordnung<K,T> extends Kollektion<T> {
  int size();
  T get(K k);
  T set(K k, T v);
  void swap(K k, K q);
}

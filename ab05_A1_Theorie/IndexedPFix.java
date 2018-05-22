/**
 * @author apries2m
 */
package ab05_A1_Theorie;
public class IndexedPFix<T> implements IndexedP<T> {
  private T[] a;
  public IndexedPFix(int size) {
    @SuppressWarnings("unchecked")
      T[] tmp = (T[])new Object[size];
    a = tmp;
  }
  public boolean isEmpty() {
    return size() == 0;
  }
  public int size() {
    return a.length;
  }
  public T get(int p) {
    return a[p];
  }
  public T set(int p, T v) {
    T result = a[p];
    a[p] = v;
    return result;
  }
  public void swap(int p, int q) {
    if (p != q) {
      T tmp = a[p];
      a[p] = a[q];
      a[q] = tmp;
    }
  }
}

/**
 * @author apries2m
 */
package ab06_A2_StapelUtil;

public class FeldFix<T>
extends FeldAbstrakt<T>
implements FeldDefaultFuerIndexed<T> {
  private T[] a;
  public FeldFix(int size) {
    @SuppressWarnings("unchecked")
      T[] tmp = (T[])new Object[size];
    a = tmp;
  }
  public int total() {
    return 1 + a.length; // a und Elemente in a
  }
  public int size() {
    return a.length;
  }
  public T get(Integer p) {
    return a[p];
  }
  public T set(Integer p, T v) {
    T result = a[p];
    a[p] = v;
    return result;
  }
}

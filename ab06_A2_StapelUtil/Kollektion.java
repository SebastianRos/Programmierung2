/**
 * @author apries2m
 */
package ab06_A2_StapelUtil;

public interface Kollektion<T> {
  /**
   * @return intern insgesamt verbrauchter Speicherplatz
   */
  int total();
  boolean isEmpty();
}

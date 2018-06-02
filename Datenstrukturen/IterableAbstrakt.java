package Datenstrukturen; /**
 * @author apries2m
 */
import java.util.Iterator;
// muss abstrakte Klasse sein, da Schnittstelle
// keine Object-Methoden ueberschreiben darf
public abstract class IterableAbstrakt<T>
implements Sequenz<T>, Iterable<T> {
  public String toString() {
    String result = "(";
    Iterator<T> i = iterator();
    if (i.hasNext()) {
      result += i.next();
    }
    while (i.hasNext()) {
      result += "," + i.next();
    }
    return result + ")";
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    Iterable<?> f = (Iterable<?>)o;
    Iterator<?> i1 = iterator();
    Iterator<?> i2 = f.iterator();
    while (i1.hasNext() && i2.hasNext()) {
      if (!i1.next().equals(i2.next())) {
        return false;
      }
    }
    return !(i1.hasNext() || i2.hasNext());
  }
}

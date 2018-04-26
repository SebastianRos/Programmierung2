/**
 *@author srosau2s
 */
package ab02_A5_PaarIterator;
import java.util.Iterator;
public class IteratorVonPaar<E, Z> implements Iterator<Paar<E, Z>>{
    private Iterator<E> iE;
    private Iterator<Z> iZ;
    int pos;

    public IteratorVonPaar(Iterator<E> pIE, Iterator<Z> pIZ){
        iE = pIE;
        iZ = pIZ;
        pos = 0;
    }

    public boolean hasNext() {
        if (iE.hasNext() && iZ.hasNext()){
            return true;
        }
        return false;
    }

    public Paar<E, Z> next() {
        pos++;
        return new Paar<>(iE.next(), iZ.next());
    }
}

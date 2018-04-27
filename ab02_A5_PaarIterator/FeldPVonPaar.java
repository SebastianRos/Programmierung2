/**
 * @author srosau2s
 */
package ab02_A5_PaarIterator;

public class FeldPVonPaar<E, Z> extends IndexedPVonPaar<E, Z> implements FeldP<Paar<E, Z>>{
    FeldP<E> e;
    FeldP<Z> z;

    public FeldPVonPaar(FeldP<E> e, FeldP<Z> z){
        super(e, z);
    }
    public IteratorVonPaar<E, Z> iterator(){
        Paar<FeldP<E>, FeldP<Z>> paar = getFeldPaar();
        return new IteratorVonPaar<>(paar.erstes().iterator(), paar.zweites().iterator());
    }
    public IteratorVonPaar<E, Z> iterator(int p){
        Paar<FeldP<E>, FeldP<Z>> paar = getFeldPaar();
        return new IteratorVonPaar<>(paar.erstes().iterator(p), paar.zweites().iterator(p));
    }
    public IteratorVonPaar<E, Z> iterator(int p, int q){
        Paar<FeldP<E>, FeldP<Z>> paar = getFeldPaar();
        return new IteratorVonPaar<>(paar.erstes().iterator(p, q), paar.zweites().iterator(p, q));
    }

    private Paar<FeldP<E>, FeldP<Z>> getFeldPaar(){
        Paar<IndexedP<E>, IndexedP<Z>> paarIndex = paarVonIndexedP();
        return new Paar<>((FeldP<E>) paarIndex.erstes(), (FeldP<Z>) paarIndex.zweites());
    }
}
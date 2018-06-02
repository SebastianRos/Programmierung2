/**
 * @author srosau2s
 */
package aB06_A1_SchlangeUtil;

import Datenstrukturen.Paar;
import Datenstrukturen.Schlange;
import Datenstrukturen.SchlangeAlsFeldDyn;

public class SchlangeUtil {

    static class intComp implements java.util.Comparator<Integer>{

        public int compare(Integer p1, Integer p2) {
            return p1.compareTo(p2);
        }
    }

    public static void main(String[] args){
        SchlangeAlsFeldDyn<Integer> q1 = new SchlangeAlsFeldDyn<>();
        q1.insert(1);
        q1.insert(2);
        q1.insert(3);
        q1.insert(4);
        SchlangeAlsFeldDyn<Integer> q2 = new SchlangeAlsFeldDyn<>();
        q2.insert(4);
        q2.insert(3);
        q2.insert(2);
        q2.insert(1);
        SchlangeAlsFeldDyn<Paar<Integer, Integer>> z = new SchlangeAlsFeldDyn<>();
        java.util.Comparator comp = new intComp();
        zipGeordnet(q1, q2, z, comp);
        while(!z.isEmpty()){
            Paar paar = z.remove();
            System.out.println(paar.erstes() + "," + paar.zweites());
        }
    }

    static <T> void zipGeordnet(Schlange<T> quelle1, Schlange<T> quelle2, Schlange<Paar<T, T>> ziel, java.util.Comparator<T> comp){
        while(!quelle1.isEmpty() && !quelle2.isEmpty()){
            Paar<T, T> paar;
            if (comp.compare(quelle1.element(), quelle2.element()) < 0) {
                paar = new Paar(quelle1.remove(), quelle2.remove());
            } else {
                paar = new Paar(quelle2.remove(), quelle1.remove());
            }
            ziel.insert(paar);
        }
    }
}

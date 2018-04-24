package aB02_A2_Rechtecke;

public class RechteckComp extends Rechteck implements Comparable<RechteckComp>{

	public RechteckComp(double pLaenge, double pBreite) {
		super(pLaenge, pBreite);
	}

	public int compareTo(RechteckComp pRechteck) {
		double a = flaeche() - pRechteck.flaeche();
		if (a > 0) {
			return 1;
		} else if (a < 0) {
			return -1;
		}
		return 0;
	}

}

package aB02_A2_Rechtecke;

public class CompRechteckFlaeche {

	public int compare(Rechteck pR1, Rechteck pR2) {
		double a = pR1.flaeche() - pR2.flaeche();
		if (a > 0) {
			return 1;
		} else if (a < 0){
			return -1;
		}
		return 0;
	}
}

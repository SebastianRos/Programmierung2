package aB02_A2_Rechtecke;

public class CompRechteckUmfang {

	public int compare(Rechteck pR1, Rechteck pR2) {
		double a = pR1.umfang() - pR2.umfang();
		if (a > 0) {
			return 1;
		} else if (a < 0){
			return -1;
		}
		return 0;
	}
}

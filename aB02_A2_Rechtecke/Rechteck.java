package aB02_A2_Rechtecke;

public class Rechteck {
	private double laenge;
	private double breite;
	
	public Rechteck(double pLaenge, double pBreite) {
		laenge = pLaenge;
		breite = pBreite;
	}
	
	public double laenge() {
		return laenge;
	}
	public double breite(){
		return breite;
	}
	
	public double flaeche() {
		return laenge * breite;
	}
	public double umfang() {
		return laenge * 2 + breite * 2;
	}
}

package ab05_A1_Theorie;

public class Theorie {

	public static void main(String[] args) {
		K k = new K();
		A z = k.f(new B[8], new FeldPFix<D>(8));
		System.out.println(z instanceof Object);
	}
	
	public class A{};
	public class B extends A{};
	public class C extends B{};
	public class D extends B{};
	public class E {};
	public static class K {
		public <T> T f(T[] x, FeldP<? extends T> y){
			return null;
		}
		public <T> T g(FeldP<? extends T> x, FeldP<? super T> y) {
			return null;
		};
	}
}

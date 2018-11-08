package acatKacke;

public class ACATKacke {
	public static void main(String args[]) {
		int[] a = {1, 2, 3};
		g(a, 1, 3);
	}
	
	public static void g1(int[] A, int l, int h) {
		if (l < h) {
			int p = pa(A, l, h);
			g(A, l, p);
			g(A, p+1, h);
			System.out.println("pling");
		}
	}
	
	public static int pa1(int[] A, int l, int h) {
		int p = A[l];
		int i = l -1;
		int j = h +1;
		while(true) {
			do {
				i = i +1;
			} while (A[i] < p);
			do {
				j = j -1;
			} while (A[j] > p);
			if (i >= j) {
				return j;
			}
			int tmp = A[i];
			A[i] = A[j];
			A[j] = tmp;
		}
	}
	public static void g(int[] A, int l, int h){
		if (l < h){
			int p = pa(A, l, h);
			g(A, l, p);
			g(A, p + 1, h);
		}
	}
	//this is a helper method of g()
	public static int pa(int[] A, int l, int h){
		int p = A[l];
		int i = l - 1;
		int j = h + 1;
		while(true){
			do{
				i = i + 1;
			}while (A[i] < p);
			do{
				j = j - 1;
			}while (A[j] > p);
			if (i >= j){
				return j;
			}
		} 
	}
}

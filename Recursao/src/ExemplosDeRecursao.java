
public class ExemplosDeRecursao {
	public static int fatorial(int n) {
		if (n==0) {
			return 1;
		} else {
			return n*fatorial(n-1);
		}
	}

	public static int fibItera(int n) {
		int m1 = 1, m2 = 0, resp = 0;
		if (n < 2) return n;
		for (int i = 2; i <= n; i++) {
			resp = m1 + m2;
			m2 = m1;
			m1 = resp;
		}
		return resp;
	}
	
	public static int fibRec(int n) {
		return (n>1) ? fibRec(n-1) + fibRec(n-2) : n;
	}
	
	public static void decimalParaBinario(int n) {
		int d, r;
		d = n/2;
		if (d>0) decimalParaBinario(d);
		r = n%2;
		System.out.print(r);
	}
	
	public static boolean ehPar(int num) {
		return (num == 0 || ehImpar(num-1));
	}
	
	public static boolean ehImpar(int num) {
		return (num!=0 && ehPar(num-1));
	}
}

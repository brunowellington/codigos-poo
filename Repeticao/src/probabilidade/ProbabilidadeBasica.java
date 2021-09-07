package probabilidade;

public class ProbabilidadeBasica {
	public static long fatorial(long val) {
		long fatorial = 1;
		for(long i=1;i<=val;i++) {
			fatorial = fatorial*i;
		}
		return fatorial;
	}

	public static long combinacoes(long Q,long T) {
		return fatorial(Q)/(fatorial(T)*fatorial(Q-T));
	}

	public static long permutacoes(long Q,long T) {
		return fatorial(Q)/fatorial(Q-T);
	}

}

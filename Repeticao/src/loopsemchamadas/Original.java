package loopsemchamadas;

public class Original {

	public static void main(String[] args) {
		long antes,depois;
		double soma;
		
		antes = System.currentTimeMillis();
		soma = 0;
		for(int contador=0; contador<10000000; contador++) {
			soma += adiciona(contador,-1)/adiciona(contador,1);
		}
		depois = System.currentTimeMillis();
		System.out.println("Sem otimização: tempo = "+(depois-antes));
	}

	public static double adiciona(double valor,double delta) {
		return valor+delta;
	}
}

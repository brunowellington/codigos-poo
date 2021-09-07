package loopunrolling;

public class Otimizado {

	public static void main(String[] args) {
		long antes,depois;
		double soma = 0, somaInterna;

		soma = 0;
		antes = System.currentTimeMillis();
		for(int contador=0; contador<10000000; contador++) {
			somaInterna = 10+contador*5;
			soma += 1./somaInterna;
		}
		depois = System.currentTimeMillis();
		System.out.println("Com otimizacao: tempo = "+(depois-antes));
	}

}

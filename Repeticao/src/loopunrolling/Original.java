package loopunrolling;

public class Original {

	public static void main(String[] args) {
		long antes, depois;
		double soma = 0, somaInterna;

		antes = System.currentTimeMillis();
		for(int contador=0; contador<10000000; contador++) {
			somaInterna = 0;
			for(int contadorInterno=contador; contadorInterno<contador+5; contadorInterno++) {
				somaInterna += contadorInterno;
			}
			soma += 1./somaInterna;
		}
		depois = System.currentTimeMillis();
		System.out.println("Sem otimizacao: tempo = "+(depois-antes));
	}

}

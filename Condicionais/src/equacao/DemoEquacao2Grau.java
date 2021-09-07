package equacao;

public class DemoEquacao2Grau {

	public static void main(String[] args) {
		Equacao2Grau eq1 = new Equacao2Grau(1, -5, 6);
		Equacao2Grau eq2 = new Equacao2Grau(4, -4, 1);
		Equacao2Grau eq3 = new Equacao2Grau(5, 1, 6);
		
		eq1.solucao();
		eq2.solucao();
		eq3.solucao();
	}

}

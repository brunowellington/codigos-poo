package otimizalacos;

public class ControleInt {

	public static void main(String[] args) {
		long antes, depois, media = 0;

		for (int i = 0; i < 5; i++) {
			antes = System.currentTimeMillis();
			double fatorDePrecisao = 1000000.;
			double fatorDeConversao = Math.PI/180.;
			double fator = fatorDeConversao/fatorDePrecisao;
			double incremento = 1/fatorDePrecisao;
			or(int anguloEmGraus=0; anguloEmGraus<360000000; anguloEmGraus++) {
				double convertido = anguloEmGraus*fator;
			}
			depois = System.currentTimeMillis();
			media += (depois-antes);
			System.out.println("Sem otimizacao: tempo = " + (depois-antes));
		}
		System.out.println("Media: " + media/5.);
	}

}

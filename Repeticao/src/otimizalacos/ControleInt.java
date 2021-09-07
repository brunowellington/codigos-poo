package otimizalacos;

public class ControleInt {

	public static void main(String[] args) {
		long antes, depois, media = 0;

		for (int i=0; i<5; i++) {
			antes = System.currentTimeMillis();
			double fatorDePrecisao = 1000000.;
			double fatorDeConversao = Math.PI/180.;
			double convertido;
			for(int anguloEmGraus=0; anguloEmGraus<360000000; anguloEmGraus++) {
				convertido = (anguloEmGraus/fatorDePrecisao)*fatorDeConversao;
			}
			depois = System.currentTimeMillis();
			media += (depois-antes);
			System.out.println("Com controle int: tempo = "+(depois-antes));
		}
		System.out.println("Media: " + media/5.);
	}

}

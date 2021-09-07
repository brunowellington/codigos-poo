package otimizalacos;

public class RemoveInvariantes {

	public static void main(String[] args) {
		long antes, depois, media = 0;

		for (int i=0; i<5; i++) {
			antes = System.currentTimeMillis();
			double fatorDePrecisao = 1000000.;
			double fatorDeConversao = Math.PI/180.;
			double incremento = 1/fatorDePrecisao;
			for(double anguloEmGraus=0; anguloEmGraus<360; anguloEmGraus+=incremento) {
				double convertido = anguloEmGraus*fatorDeConversao;
			}
			depois = System.currentTimeMillis();
			media += (depois-antes);
			System.out.println("Com otimizacao: tempo = "+(depois-antes));
		}
		System.out.println("Media: " + media/5.);
	}

}

package otimizalacos;

public class OtimizacaoLacos {

	public static void main(String[] args) {
		long antes, depois;
		
		// versao original
		antes = System.currentTimeMillis();		
		double fatorDePrecisao = 1000000.;
		for(double anguloEmGraus=0; anguloEmGraus<360; anguloEmGraus+=1/fatorDePrecisao) {
			double convertido = anguloEmGraus*Math.PI/180.;
		}
		depois = System.currentTimeMillis();
		System.out.println("Sem otimizacao: tempo = "+(depois-antes));

		// com remocao de invariantes
		antes = System.currentTimeMillis();
		double fatorDeConversao = Math.PI/180.;
		double incremento = 1/fatorDePrecisao;
		double convertido;
		for(double anguloEmGraus=0; anguloEmGraus<360; anguloEmGraus+=incremento) {
			convertido = anguloEmGraus*fatorDeConversao;
		}
		depois = System.currentTimeMillis();
		System.out.println("Com otimizacao: tempo = "+(depois-antes));

		// variavel de controle do tipo int
		antes = System.currentTimeMillis();
		for(int anguloEmGraus=0; anguloEmGraus<360000000; anguloEmGraus++) {
			convertido = (anguloEmGraus/fatorDePrecisao)*fatorDeConversao;
		}
		depois = System.currentTimeMillis();
		System.out.println("Com otimizacao: tempo = "+(depois-antes));

	}

}

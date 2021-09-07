package otimizalacos;

public class Original {

	public static void main(String[] args) {
		long antes, depois, media = 0;
		for (int i=0; i<5; i++) {
			antes = System.currentTimeMillis();		
			double fatorDePrecisao = 1000000.;
			for(double anguloEmGraus=0; anguloEmGraus<360; anguloEmGraus+=1/fatorDePrecisao) {
				double convertido = anguloEmGraus*Math.PI/180.;
			}
			depois = System.currentTimeMillis();
			media += (depois-antes);
			System.out.println("Sem otimizacao: tempo = "+(depois-antes));		
		}
		System.out.println("Media: " + media/5.);
	}

}

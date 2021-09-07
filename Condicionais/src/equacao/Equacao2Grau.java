package equacao;

public class Equacao2Grau {
	private double a, b, c, delta, x1, x2;
	
	public Equacao2Grau(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void solucao() {
		delta = b*b - 4*a*c;
		if (delta < 0) {
			System.out.println("A equacao nao possui raizes reais");
		} else {
			if (delta == 0) {
				x1 = -b/(2*a);
				System.out.println("A equacao possui uma raiz real igual a " + x1);
			} else {
				x1 = (-b+Math.sqrt(delta))/(2*a);
				x2 = (-b-Math.sqrt(delta))/(2*a);
				System.out.println("A equacao possui duas raizes reais iguais a " + x1 + " e " + x2);
			}
		}
	}
}

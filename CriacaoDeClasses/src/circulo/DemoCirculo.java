package circulo;

public class DemoCirculo {

	public static void main(String[] args) {
		Circulo c1 = new Circulo(2.5);
		System.out.println("O perimetro do circulo eh " + c1.perimetro());
		System.out.println("O valor aproximado de PI eh " + Circulo.PI);
		System.out.println("O valor PI eh " + Math.PI);
	}

}

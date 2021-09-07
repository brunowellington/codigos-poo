package circulo;

public class Circulo {
	private double raio;
	final static public double PI = 3.14;
	
	Circulo(double raio) {
		this.raio = raio;
	}
	
	public double perimetro() {
		return 2*PI*raio;
	}
}

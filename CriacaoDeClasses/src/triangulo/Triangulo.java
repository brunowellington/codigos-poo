package triangulo;

public class Triangulo {
	private float lado1;
	private float lado2;
	private float lado3;
	public String desc;
	
	public void inicializar(float lado1, float lado2, float lado3, String desc) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.desc = desc;
	}
	
	public float calculaPerimetro() {
		return lado1+lado2+lado3;
	}

}

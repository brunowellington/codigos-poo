package comparacao;

public class ComparaInt {
	public static int maiorInt(int n1, int n2) {
		int valor = (n1 > n2 ? n1 : n2);
		return valor;
	}
	
	public static int menorInt(int n1, int n2) {
		return (n1 < n2 ? n1 : n2);
	}
}

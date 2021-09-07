
public class Lampada {
	private final String ACESA = "acesa";
	private final String APAGADA = "apagada";
	private String estadoLampada;
	private Contador cont = new Contador();
	
	public void acende() {
		estadoLampada = ACESA;
		cont.incrementar();
	}
	
	public void apaga() {
		estadoLampada = APAGADA;
	}
	
	public void mostraEstado() {
		System.out.println(estadoLampada);
	}
	
	public boolean estaLigada() {
		return (estadoLampada == ACESA);
	}
	
	public void zerarContador() {
		cont.zerar();
	}
	
	public void imprimirQtdAcesa() {
		System.out.println("Quantidade de vezes que a lampada foi acesa: ");
		cont.imprimir();
	}
}

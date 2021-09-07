
public class MainLampada {
	
	public static void main(String[] args) {
		Lampada lamp = new Lampada();
		
		lamp.zerarContador();
		lamp.acende();
		lamp.mostraEstado();
		lamp.apaga();
		lamp.mostraEstado();
		lamp.acende();
		lamp.mostraEstado();
		if (lamp.estaLigada()) {
			System.out.println("A lampada esta acesa");
		}
		lamp.imprimirQtdAcesa();
	}

}

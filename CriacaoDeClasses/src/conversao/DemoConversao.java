package conversao;

public class DemoConversao {

	public static void main(String[] args) {		
		System.out.println("vinte pes sao " + ConversaoUnidades.pesCentrimetros(20) + " centimetros");
		System.out.println("cinco polegadas sao " + ConversaoUnidades.polegadasCentrimetros(5) + " centimetros" );
		System.out.println("oito milhas sao " + ConversaoUnidades.milhasQuilometros(8) + " quilometros" );
	}

}

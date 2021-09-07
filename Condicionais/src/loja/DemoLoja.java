package loja;

public class DemoLoja {

	public static void main(String[] args) {
		Loja loja1 = new Loja("Frigotil", "Rua Amaro Cavalcante", 60);
		Loja loja2 = new Loja("Xavier Pneus", "Rua da Independencia", 1990);
		Loja loja3 = new Loja("Frigotil", "Rua Amaro Cavalcante", 60);
		
		if (loja1.ehIgual(loja2)) {
			System.out.println("As lojas 1 e 2 sao iguais");
		} else {
			System.out.println("As lojas 1 e 2 sao diferentes");
		}
		
		if (loja1.ehIgual(loja3)) {
			System.out.println("As lojas 1 e 3 sao iguais");
		} else {
			System.out.println("As lojas 1 e 3 sao diferentes");
		}
	}

}

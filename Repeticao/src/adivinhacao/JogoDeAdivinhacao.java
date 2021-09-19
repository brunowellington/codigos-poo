package adivinhacao;

import java.util.Scanner;

public class JogoDeAdivinhacao {
	private int valor;

	public JogoDeAdivinhacao(int valor) {
		this.valor = valor;
	}
	
	public void jogar() {
		final int tentativas = 20;
		int contador = 1;
		int estaTentativa;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tente adivinhar o numero secreto em " + tentativas + " tentativas");
		
		do {
			System.out.print("Tentativa numero " + contador + ": ");
			estaTentativa = sc.nextInt();
			if (estaTentativa == this.valor) {
				System.out.println("Parabens! Voce acertou o numero!");
				return;
			} else if (estaTentativa < this.valor) {
				System.out.println("O numero " + estaTentativa + " eh menor que o numero secreto");				
			} else {
				System.out.println("O numero " + estaTentativa + " eh maior que o numero secreto");					
			}
			contador++;
		} while(contador <= tentativas);
		
		System.out.println("Suas tentivas se esgotaram");
		
		sc.close();
	}	
	
}

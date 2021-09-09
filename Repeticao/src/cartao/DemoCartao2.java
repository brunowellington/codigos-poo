package cartao;

import java.util.Calendar;
import java.util.Scanner;

public class DemoCartao2 {

	public static void main(String[] args) {
		Calendar calendario = Calendar.getInstance();
		int ano = calendario.get(Calendar.YEAR);
		int mes = 1+calendario.get(Calendar.MONTH);
		Scanner sc = new Scanner(System.in);
		String nome;
		int numero;
		int codigo;
		int anoValidade;
		int mesValidade;
		
		System.out.println("Formulario de cadastro de cartao");
		
		System.out.print("Nome: ");
		nome = sc.next();
		
		System.out.print("Numero: ");
		numero = sc.nextInt();
		
		System.out.print("Codigo: ");
		codigo = sc.nextInt();

		do {
			System.out.print("Ano da Validade: ");
			anoValidade = sc.nextInt();
			if (anoValidade < ano) {
				System.out.println("Ano invalido");
			}
		} while(anoValidade < ano);

		do {
			System.out.print("Mes da Validade: ");
			mesValidade = sc.nextInt();
			if ((anoValidade==ano) && (mesValidade < mes)) {
				System.out.println("Mes invalido");
			}
		} while((anoValidade==ano) && (mesValidade < mes));
		
		Cartao ufersaCard = new Cartao(nome, numero, codigo, anoValidade, mesValidade);
		
		sc.close();
	}

}

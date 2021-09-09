package cartao;

import java.util.Calendar;
import java.util.Scanner;

public class DemoCartao {

	public static void main(String[] args) {
		Calendar calendario = Calendar.getInstance();
		int ano = calendario.get(Calendar.YEAR);
		int mes = 1+calendario.get(Calendar.MONTH);
		Scanner sc = new Scanner(System.in);
		String nome;
		int numero;
		int codigo;
		int anoValidade = -1;
		int mesValidade;
		
		System.out.println("Formulario de cadastro de cartao");
		
		System.out.print("Nome: ");
		nome = sc.next();
		
		System.out.print("Numero: ");
		numero = sc.nextInt();
		
		System.out.print("Codigo: ");
		codigo = sc.nextInt();

		while (anoValidade < ano) {
			System.out.print("Ano da Validade: ");
			anoValidade = sc.nextInt();
			if (anoValidade < ano) {
				System.out.println("Ano invalido");
			}
		}

		System.out.print("Mes da Validade: ");
		mesValidade = sc.nextInt();
		while ((anoValidade==ano) && (mesValidade < mes)) {
			System.out.println("Mes invalido");
			System.out.print("Mes da Validade: ");
			mesValidade = sc.nextInt();
		}
		
		Cartao ufersaCard = new Cartao(nome, numero, codigo, anoValidade, mesValidade);
		
		sc.close();
	}

}

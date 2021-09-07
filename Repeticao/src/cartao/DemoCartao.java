package cartao;

import java.util.Calendar;
import java.util.Scanner;

public class DemoCartao {

	public static void main(String[] args) {
		Calendar calendario = Calendar.getInstance();
		int ano = calendario.get(Calendar.YEAR);
		int mes = calendario.get(Calendar.MONTH);
		Scanner sc =  new Scanner(System.in);
		String nome;
		int numero;
		int codigo;
		int anoValidade = -1;
		int mesValidade = -1;
		
		System.out.println("Formulario de cadastrado de cartao");
		
		System.out.print("Nome: ");
		nome = sc.next();
		
		System.out.println("Numero: ");
		numero = sc.nextInt();
		
		System.out.println("Codigo ");
		codigo = sc.nextInt();
		
		while(anoValidade < ano) {
			System.out.println("Ano da validade: ");
			anoValidade = sc.nextInt();
			if (anoValidade < ano) {
				System.out.println("Ano invalido");
			}
		}

		while(mesValidade < mes) {
			System.out.println("Mes da validade: ");
			mesValidade = sc.nextInt();
			if (mesValidade < mes) {
				System.out.println("Mes invalido");
			}
		}
		
		Cartao ufersaCard = new Cartao(nome, numero, codigo, anoValidade, mesValidade);
		
		sc.close();
	}

}

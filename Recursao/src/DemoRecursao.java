import java.util.Scanner;

public class DemoRecursao {
	public final int NUMTESTS = 11;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		
		System.out.println("0 - Fatorial");
		System.out.println("1 - Fibonnaci");
		System.out.println("2 - Conversao decimal/binario");
		System.out.println("3 - Recursao indireta (par ou impar)");
		System.out.print("Numero do exemplo que deseja executar: ");
		opcao =  sc.nextInt();
		
		switch (opcao) {
		case 0:// Fatorial
			for (int i = 0; i < NUMTESTS; i++) {
				System.out.println("Fatorial de " + i + ": " + ExemplosDeRecursao.fatorial(i));
			}
			break;
		case 1:// Fibonacci
			for (int i = 0; i < NUMTESTS; i++) {
				System.out.println("fibRec(" + i + ") = " + ExemplosDeRecursao.fibRec(i) + "\tfibItera(" + i + ") = " + ExemplosDeRecursao.fibItera(i));			
			}
			break;
		case 2:// Conversao decimal/binario
			for (int i = 0; i < NUMTESTS; i++) {
				System.out.print("(" + i + ")_10 = (");
				ExemplosDeRecursao.decimalParaBinario(i);
				System.out.println(")_2");
			}
			break;
		case 3:// Recursao indireta (par ou impar)
			for (int i = 0; i < NUMTESTS; i++) {
				System.out.println("ehPar(" + i + ")=" + ExemplosDeRecursao.ehPar(i) + "\tehImPar(" + i + ")=" + ExemplosDeRecursao.ehImpar(i));
			}
			break;
		default:
			System.out.println("Opcao invalida!");
		}
		
		sc.close();
	}

}

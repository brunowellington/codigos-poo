package breaktest;

public class BreakTest {

	public static void main(String[] args) {
		int cont;
		for (cont = 1; cont <= 10; cont++) {
			if (cont == 5)
				break;
			System.out.printf("%d ", cont);
		}
		System.out.printf("%nLoop interrompido com cont = %d%n", cont);
	}

}

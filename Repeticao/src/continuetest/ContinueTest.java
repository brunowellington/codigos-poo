package continuetest;

public class ContinueTest {

	public static void main(String[] args) {
		for (int cont = 1; cont <= 10; cont++) {
			if (cont == 5)
				continue;
			System.out.printf("%d ", cont);
		}
	}

}

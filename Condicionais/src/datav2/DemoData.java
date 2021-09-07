package datav2;

public class DemoData {

	public static void main(String[] args) {
		Data d1 = new Data(5, 6, 1998);
		Data d2 = new Data(26, 10, 2001);

		System.out.println("1a data: " + d1 + ". O mes teve " + d1.diasNoMes() + " dias");
		System.out.println("2a data: " + d2 + ". O mes teve " + d2.diasNoMes() + " dias");
	}

}

package registro;

public class DemoRegistroAcademico {

	public static void main(String[] args) {
		RegistroAcademico michael = new RegistroAcademico("Michael", 189615, 2, 100.0);
		RegistroAcademico roberto = new RegistroAcademico("Roberto", 46843, 1, 90.0);
		
		System.out.println("A mensalidade de Michael eh " + michael.calculaMensalidade());		
		System.out.println("A mensalidade de Roberto eh " + roberto.calculaMensalidade());
	}

}

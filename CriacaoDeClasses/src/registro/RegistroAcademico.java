package registro;

public class RegistroAcademico {
	private String nome;
	private int matricula;
	private int codigoCurso;
	private double percentualDeCobranca;
	
	RegistroAcademico(String nome, int matricula, int codigoCurso, double percentualDeCobranca) {
		this.nome = nome;
		this.matricula = matricula;
		this.codigoCurso = codigoCurso;
		this.percentualDeCobranca = percentualDeCobranca;
	}
	
	public double calculaMensalidade() {
		double mensalidadeCurso = 0.0;
		if (codigoCurso == 1) {
			mensalidadeCurso = 450.0;
		}
		if (codigoCurso == 2) {
			mensalidadeCurso = 500.0;
		}
		if (codigoCurso == 3) {
			mensalidadeCurso = 550.0;
		}
		if (codigoCurso == 4) {
			mensalidadeCurso = 380.0;
		}
		return (mensalidadeCurso*percentualDeCobranca/100.0);
	}
}

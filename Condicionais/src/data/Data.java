package data;

public class Data {
	private int dia, mes, ano;

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String toString() {
		String resultado = String.valueOf(dia) + " de ";
		if (mes == 1) {
			resultado += "janeiro ";
		} else if (mes == 2) {
			resultado += "fevereiro ";
		} else if (mes == 3) {
			resultado += "marco ";
		} else if (mes == 4) {
			resultado += "abril ";
		} else if (mes == 5) {
			resultado += "maio ";
		} else if (mes == 6) {
			resultado += "junho ";
		} else if (mes == 7) {
			resultado += "julho ";
		} else if (mes == 8) {
			resultado += "agosto ";
		} else if (mes == 9) {
			resultado += "setembro ";
		} else if (mes == 10) {
			resultado += "outubro ";
		} else if (mes == 11) {
			resultado += "novembro ";
		} else {
			resultado += "dezembro ";
		}
		resultado += ("de " + ano);
		return resultado;
	}
}

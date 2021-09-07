package datav2;

public class Data {
	private int dia, mes, ano;

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String toString() {
		String resultado = String.valueOf(dia) + " de ";
		
		switch(mes) {
		case 1:
			resultado += "janeiro ";
			break;
			case 2:
				resultado += "fevereiro ";
				break;
			case 3:
				resultado += "marco ";
			case 4:
				resultado += "abril ";
				break;
			case 5:
				resultado += "maio ";
				break;
			case 6:
				resultado += "junho ";
				break;
			case 7:
				resultado += "julho ";
				break;
			case 8:
				resultado += "agosto ";
				break;
			case 9:
				resultado += "setembro ";
				break;
			case 10:
				resultado += "outubro ";
				break;
			case 11:
				resultado += "novembro ";
				break;
			case 12:
				resultado += "dezembro ";
				break;
		}
		resultado += ("de " + ano);
		return resultado;
	}
	
	public int diasNoMes() {
		int numeroDeDias;
		switch(mes) {
		case 2:
			numeroDeDias = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			numeroDeDias = 30;
			break;
		default:
			numeroDeDias = 31;
			break;
		}
		return numeroDeDias;
	}
}


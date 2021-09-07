package loja;

public class Loja {
	private String nome;
	private String rua;
	private int numero;
	
	public Loja(String nome, String rua, int numero) {
		this.nome = nome;
		this.rua = rua;
		this.numero = numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getRua() {
		return rua;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public boolean ehIgual(Loja loja) {
		return (this.nome.equals(loja.getNome()) && this.rua.equals(loja.getRua()) && (numero==loja.getNumero()));
	}
}

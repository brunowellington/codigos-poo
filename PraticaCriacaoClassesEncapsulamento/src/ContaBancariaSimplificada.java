
public class ContaBancariaSimplificada {
	private String nomeCorrentista;
	private boolean contaEhEspecial;
	private double saldo;
	
	public boolean abreContaSimples(String nomeCorrentista, boolean contaEhEspecial, double saldoInicial) {
		if (nomeCorrentista == "" || saldoInicial < 0) {
			return false;
		}
		this.nomeCorrentista = nomeCorrentista;
		this.contaEhEspecial = contaEhEspecial;
		this.saldo = saldoInicial;
		
		return true;
	}
	
	public boolean deposita(double valor) {
		if (valor <= 0) {
			return false; 
		}
		saldo += valor;
		return true;
	}
	
	public boolean retira(double valor) {
		if (valor > saldo || valor <= 0) {
			return false;
		}
		saldo -= valor;
		return true;
	}
	
	public void mostraDados() {
		System.out.println("Correntista: " + this.nomeCorrentista);
		System.out.print("A conta ");
		if (!this.contaEhEspecial) {
			System.out.print("não ");
		}
		System.out.println("é especial");
		System.out.println("Saldo: " + this.saldo);	
	}
}

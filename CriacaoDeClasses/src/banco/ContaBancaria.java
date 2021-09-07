package banco;

public class ContaBancaria {
	private String nomeCorrentista;
	private boolean contaEhEspecial;
	private double saldo;
	
	ContaBancaria(String nomeCorrentista, boolean contaEhEspecial, double saldoInicial) {
		this.nomeCorrentista = nomeCorrentista;
		this.contaEhEspecial = contaEhEspecial;
		this.saldo = saldoInicial;
	}
	
	ContaBancaria(String nomeCorrentista) {
		this.nomeCorrentista = nomeCorrentista;
		this.contaEhEspecial = false;
		this.saldo = 0;
	}
	
	public void mostraDados() {
		System.out.println("Nome: " + this.nomeCorrentista);
		System.out.print("A conta ");
		if (!contaEhEspecial) {
			System.out.print("nao ");
		}
		System.out.println("eh especial");
		System.out.println("Saldo: " + this.saldo);
	}

}

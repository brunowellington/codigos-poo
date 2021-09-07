package caixa;

public class CaixaBanco {
	public static int clientesAtendidos = 0;
	private int numeroCaixa;
	
	CaixaBanco(int n) {
		this.numeroCaixa = n;
	}
	
	public void iniciaAtendimento() {
		clientesAtendidos++;
		System.out.println("Cliente " + clientesAtendidos + " dirija-se ao caixa " + numeroCaixa);
	}
}

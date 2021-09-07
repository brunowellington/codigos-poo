package banco;

public class DemoContaBancaria {

	public static void main(String[] args) {
		ContaBancaria contaJoao = new ContaBancaria("Joao");
		ContaBancaria contaMaria = new ContaBancaria("Maria", true, 45876.12);
		contaJoao.mostraDados();
		contaMaria.mostraDados();
	}

}

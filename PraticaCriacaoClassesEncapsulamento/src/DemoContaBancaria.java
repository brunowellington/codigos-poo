
public class DemoContaBancaria {
	public static void main(String[] args) {
		ContaBancariaSimplificada contaBanco1 = new ContaBancariaSimplificada();
		ContaBancariaSimplificada contaBanco2 = new ContaBancariaSimplificada();
		
		if (contaBanco1.abreContaSimples("Maria Joao", true, 150.46)){
			System.out.println("Conta bancaria 1 aberta com sucesso!");
			contaBanco1.mostraDados();
		} else {
			System.err.println("Valores invalidos para abertura da conta 1");
			return;
		}
		
		if (contaBanco2.abreContaSimples("Joao Maria", false, 22.79)){
			System.out.println("Conta bancaria 2 aberta com sucesso!");
			contaBanco2.mostraDados();
		} else {
			System.err.println("Valores invalidos para abertura da conta 2");
			return;
		}
		
		if (transfere(contaBanco1, contaBanco2, 45.84)) {
			System.out.println("Transferencia realizada com sucesso!");
			System.out.println("==== Dados da conta 1: ");
			contaBanco1.mostraDados();
			System.out.println("==== Dados da conta 2: ");
			contaBanco2.mostraDados();
		} else {
			System.err.println("Transferencia invalida!");
		}
	}
	
	public static boolean transfere(ContaBancariaSimplificada contaOrig, ContaBancariaSimplificada contaDest, double valor) {
		if (contaOrig.retira(valor)) {
			if (contaDest.deposita(valor)) {
				return true;
			}
		}
		return false;		
	}
}

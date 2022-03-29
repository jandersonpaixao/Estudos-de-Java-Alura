package xndbank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		minhaConta.saldo = 300;
		System.out.println("Minha Conta aberta com R$" + minhaConta.saldo);
		System.out.println("=======================================");
		System.out.println("depositar: R$50");
		minhaConta.deposita(50.0);
		System.out.println("Deposito efetuado de: R$50");
		System.out.println("=======================================");
		System.out.println("Saldo atual da conta: R$" + minhaConta.saldo);
		System.out.println("=======================================");
		
		
		boolean transacaoAceita = minhaConta.saca(150.0);
		System.out.println("efetuar saque de: R$150");
		System.out.println("=======================================");
		System.out.println("Saldo atual da conta: R$" + minhaConta.saldo);
		System.out.println("=======================================");
		System.out.println("transa��o aceita: " + transacaoAceita);
		System.out.println("=======================================");
		System.out.println("=======================================");
		System.out.println("=======================================");
		
		Conta contaAllana = new Conta();
		contaAllana.saldo = 1000;
		
		System.out.println("Nova conta de Allana aberta com R$" + contaAllana.saldo);
		System.out.println("=======================================");
		System.out.println("transferir da conta de Allana para Minha Conta: R$500");
		System.out.println("=======================================");
		if(contaAllana.transfere(500.0, minhaConta)) {
			System.out.println("transferencia realizada com sucesso!");
		}else {
			System.out.println("Saldo negativo.");
		}
		System.out.println("=======================================");
		System.out.println("saldo atual conta de Allana: R$" + contaAllana.saldo);
		System.out.println("saldo atual Minha Conta: R$" + minhaConta.saldo);
		
		 
				
	}
}

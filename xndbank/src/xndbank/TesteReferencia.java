package xndbank;

public class TesteReferencia {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("===mostra o saldo inicial===");
		System.out.println("O saldo da primeira conta � R$" + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		segundaConta.saldo = 400;
		System.out.println("===cria segunda conta referenciando a primeira conta com o valor de R$400===");
		System.out.println("O saldo da segunda conta � R$" + segundaConta.saldo);
		System.out.println("===mostra o saldo da primeira conta com o mesmo valor da segunda conta criada===");
		System.out.println("O saldo da primeira conta � R$" + primeiraConta.saldo);
		System.out.println("===mostra que as duas contas s�o as mesmas pois a segunda conta apenas referencia o mesmo local que a primeira===");
		
		if(primeiraConta == segundaConta) {
			System.out.println("s�o a mesma conta");
		}else {
			System.out.println("s�o contas diferentes");
		}
	}
	
	
	
}

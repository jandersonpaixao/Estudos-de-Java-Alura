package xndbank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println("Primeira conta possui R$" + primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 300;
		System.out.println("segunda conta possui R$" + segundaConta.saldo);
		  
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.titular);
	}
}


public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDeAllana = new Conta();
		contaDeAllana.deposita(100);
		
		contaDeAllana.titular = new Cliente();
		contaDeAllana.titular.nome = "Allana Evellyn";
		System.out.println("Novo cliente: " + contaDeAllana.titular.nome + ".");
		System.out.println("Saldo da conta R$" + contaDeAllana.getSaldo() + ".");
	}
}

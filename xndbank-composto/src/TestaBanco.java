
public class TestaBanco {
	public static void main(String[] args) {
		Cliente Janderson = new Cliente();
		Janderson.nome = "Janderson Paix�o";
		Janderson.cpf = "333.333.333-33";
		Janderson.profissao = "programador";
		
		Conta contaJanderson = new Conta();
		contaJanderson.titular = Janderson;
		contaJanderson.saldo = 1000; 
		System.out.println("Nova conta aberta, cliente: " + contaJanderson.titular.nome);
		System.out.println("Saldo da conta de " + Janderson.nome + ": R$" + contaJanderson.saldo);
		System.out.println(contaJanderson.titular);
	}
}

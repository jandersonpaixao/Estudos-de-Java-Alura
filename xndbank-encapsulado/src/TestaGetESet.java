
public class TestaGetESet {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(420,4200420);
		System.out.println("============================================");
		System.out.println("Nova conta aberta N? " + conta.getNumero());
		
		Cliente cliente = new Cliente();
		cliente.setNome("janderson paixao");
		System.out.println("nome do Cliente: " + cliente.getNome());
		conta.setTitular(cliente);
		System.out.println("Titular da conta: " + conta.getTitular().getNome());
		cliente.setCpf("042004200-420");
		System.out.println("CPF: " + cliente.getCpf());
		cliente.setProfissao("Programador");
		System.out.println("Profiss?o: " + cliente.getProfissao());
		System.out.println("============================================");
		System.out.println("============================================");
		System.out.println("Novo deposito efetuado: R$8.000.00");
		
		
		conta.deposita(8000);
		System.out.println("Saldo atual da conta: R$" + conta.getSaldo());
		System.out.println("============================================");
		System.out.println("Ag?ncia: " + conta.getAgencia());
		System.out.println("----------------------------------------------");
		
		
		
	}
}

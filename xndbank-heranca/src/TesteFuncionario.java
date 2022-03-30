
public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		FuncionarioBase janderson = new FuncionarioBase();
		janderson.setNome("Janderson Paixão");
		janderson.setCpf("555222111-2");
		janderson.setSalario(20000);
		
		System.out.println(janderson.getNome());
		System.out.println(janderson.getSalario());
	}

}

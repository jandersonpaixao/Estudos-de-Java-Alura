
public class OutroFuncionario {
	public static void main(String[] args) {
		FuncionarioCopia f1 = new FuncionarioCopia();
		
		f1.setTipo(0);
		f1.setNome("f1");
		f1.setSalario(2000);
		
		System.out.println(f1.getTipo());
		System.out.println(f1.getNome());
		System.out.println(f1.getSalario());
		System.out.println(f1.getBonificacao());
		
		FuncionarioCopia f2 = new FuncionarioCopia();
		
		f2.setTipo(1);
		f2.setNome("f1");
		f2.setSalario(4000);
		
		System.out.println(f2.getTipo());
		System.out.println(f2.getNome());
		System.out.println(f2.getSalario());
		System.out.println(f2.getBonificacao());
		
		FuncionarioCopia f3 = new FuncionarioCopia();
		
		f3.setTipo(2);
		f3.setNome("f3");
		f3.setSalario(4000);
		
		System.out.println(f3.getNome());
		System.out.println(f3.getSalario());
		System.out.println(f3.getBonificacao());
		
		
	}
}


public class Gerente extends FuncionarioBase {
	
	private int senha;
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
	
//	public double getBonificacao() {
//		return this.salario * 0.1;
//	}
	
	

}

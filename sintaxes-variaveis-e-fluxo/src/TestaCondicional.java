
public class TestaCondicional {
	
	public static void main(String[] args) {
		
		System.out.println("testando condicionais");
		
		 int idade = 16;
		 boolean acompanhado = true;
		
		if(idade >= 18) {
			System.out.println("voc� tem mais de 18 anos!");
			System.out.println("seja bem vindo!");
		}else {
			if(acompanhado = true) {
				System.out.println("acesso permitido apenas por estar com acompanhante"
						+ " maior de 18 anos");
			}else {
				System.out.println("acesso negado!");
			}
			
		}
	}
}


public class TestaEscopoDeVariaveis {

	public static void main(String[] args) {

		System.out.println("testando condicionais");
		System.out.println("====================");
		int idade = 16;
		int quantidadePessoas = 3;

		boolean acompanhado;
		
		if(quantidadePessoas >= 2) {
			acompanhado = true;
		}else {
			acompanhado = false;
		}

		if (idade >= 18 || acompanhado) {

			System.out.println("seja bem vindo!");
		} else {
			System.out.println("acesso negado");

		}
	}
}
//aqui é testado até onde uma variavel pode ir. se a variavel acompanhado nao tivesse
//sido inicializada como boolean na linha 11 ela so existiria dentro do escopo do IF
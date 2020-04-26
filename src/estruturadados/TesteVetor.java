package estruturadados;

public class TesteVetor {

	public static void main(String[] args) {

		Aluno a = new Aluno("Marcos");
		Aluno b = new Aluno("Ediwaldo");

		Vetor lista = new Vetor();

		System.out.println(lista.tamanho());
		lista.adiciona(a);
		System.out.println(lista.tamanho());
		lista.adiciona(b);
		System.out.println(lista.tamanho());

		System.out.println(lista);

		System.out.println(lista.contem(b));

		// Aluno x = lista.pega(10000000);
		// System.out.println(x);
		
		Aluno c = new Aluno("Maria");
		System.out.println(lista.tamanho());
		lista.adiciona(2, c);
		System.out.println(lista.tamanho());
		System.out.println(lista);
		System.out.println(lista.tamanho());
		lista.remove(2);
		System.out.println(lista.tamanho());
		System.out.println(lista);
		
	}

}

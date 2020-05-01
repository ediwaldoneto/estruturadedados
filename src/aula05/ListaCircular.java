package aula05;

public class ListaCircular {
	private Nodo inicio;
	private Nodo ultimo;
	private int quantidadeNodos;

	public ListaCircular() {
		this.ultimo = null;
		this.inicio = null;
		this.quantidadeNodos = 0;
	}

	public void inserirElemento(Pessoa p1) {
		Nodo novoNodo = new Nodo(p1);

		if (isEmpty()) {
			inicio = novoNodo;
			inicio.setProximo(novoNodo);
			inicio.setAnterior(novoNodo);
		} else {
			Nodo aux = inicio;
			while (aux.getProximo() != inicio) {
				aux = aux.getProximo();
			}
			aux.setProximo(novoNodo);
			novoNodo.setAnterior(aux);
			novoNodo.setProximo(inicio);
			inicio.setAnterior(novoNodo);
		}
		quantidadeNodos++;
	}

	public void removerInicio() {
		if (isEmpty()) {
			throw new RuntimeException(" --> A lista se encontra vazia.");
		} else {
			Nodo aux1 = inicio;
			Nodo aux2 = inicio;
			if (aux1.getProximo() == inicio) {
				inicio = null;
			} else {
				while (aux1.getProximo() != inicio) {
					aux1 = aux1.getProximo();

				}
				inicio = aux2.getProximo();
				aux1.setProximo(inicio);
			}
			quantidadeNodos--;
		}
	}

	public void removerFim() {
		if (isEmpty()) {
			throw new RuntimeException(" --> A lista se encontra vazia.");
		}
		Nodo aux1 = inicio;
		Nodo aux2 = null;
		while (aux1.getProximo() != inicio) {
			if (aux1.getProximo() == inicio) {
				inicio = null;
			} else {
				aux2 = aux1;
				aux1 = aux1.getProximo();

			}

		}
		aux2.setProximo(inicio);
		quantidadeNodos--;

	}

	public void exibirOrdem() {
		Nodo aux = inicio;
		String mensagem = "";

		do {
			mensagem += aux.getPessoa().getNome() + " -> ";
			aux = aux.getProximo();
		} while (aux != inicio);

		System.out.println(mensagem);
	}

	public boolean isEmpty() {
		return (this.inicio == null);
	}

}
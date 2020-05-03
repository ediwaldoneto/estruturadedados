package aula06;

public class Pilha {

	private Nodo topo;
	private int tamanho;
	private String[] elemento;

	public Pilha() {
		this.topo = null;
		this.tamanho = 0;
	}

	public void exibePilha() {
		Nodo aux = topo;
		String elementos = "";

		while (aux != null) {
			elementos += aux.getNome() + " -> ";
			aux = aux.getProximo();
		}
		System.out.println(elementos);
	}

	public String getNomeTopo() {
		return topo.getNome();
	}

	public boolean isEmpty() {
		if (topo == null)
			return true;
		else
			return false;
	}

	public void push(String nome) {
		Nodo aux = topo;
		topo = new Nodo();
		topo.setNome(nome);
		topo.setProximo(aux);

	}

	public void pop() {
		topo = topo.getProximo();
				
	}
		
}
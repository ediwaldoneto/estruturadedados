package aula06;

import java.util.LinkedList;
import java.util.List;

public class Pilha {

	private Nodo topo;
	private int tamanho;
	private List<String> nomes = new LinkedList<String>();
	
	public Pilha() {
		this.topo = null;
		this.tamanho = 0;
	}
	
		
	public void exibePilha() {
		Nodo aux = topo;
		String elementos="";
		
		while(aux != null) {
			elementos += aux.getNome() + " -> ";
			aux = aux.getProximo();
		}
		System.out.println(elementos);
	}
	
	public String getNomeTopo() {
		return topo.getNome();
	}
	
	public void insere(String elementos) {
	    nomes.add(elementos);
	    
	}
	
	public String remove() {
	    return nomes.remove(nomes.size()-1);
	}

	public boolean isEmpty() {
		if(topo == null)
			return true;
		else
			return false;
	}
	
	
}
package aula06;



public class TestePilha {

	public static void main(String[] args) {
		
		Pilha p = new Pilha();
		p.push("JoAo");	   
		p.push("MaRia");
		p.push("JoSe");
		p.push("Zezinho");
		p.exibePilha();
		p.pop();
		
		
		//System.out.println("Elemento removido " + p.pop());
		//System.out.println("Elemento removido " + p.pop());
		
		p.exibePilha();
	}
}

package estruturadados;

import java.util.Arrays;

public class Vetor {

	private Aluno[] alunos = new Aluno[100];
	private int totalAlunos = 0;

	public void adiciona(int posicao, Aluno aluno) {// Adiciona em qualquer posicao do vetor
		for (int i = totalAlunos - 1; i >= posicao; i = -1) {
			alunos[i + 1] = alunos[i];
		}
		alunos[posicao] = aluno;
		totalAlunos++;
	}

	
	@SuppressWarnings("unused")
	private boolean posicaoValida(final int posicao) { // Verifica a posicao e valida
		return posicao >= 0 && posicao <= totalAlunos;
	}

	public void adiciona(Aluno aluno) {// Adicionando aluno no vetor
		this.alunos[totalAlunos] = aluno;
		totalAlunos++;

	}

	public boolean posicaoOcupada(int posicao) { // Verificando se a posicao esta ocupada no vetor
		return posicao >= 0 && posicao < totalAlunos;
	}

	public Aluno pega(int posicao) {// Recuperando um aluno no vetor
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("posicao invalida");
		}

		return alunos[posicao];
	}

	public void remove(int posicao) { // Remove uma posicao no vetor
		for (int i = posicao; i < this.totalAlunos; i++) {
			this.alunos[i] = this.alunos[i + 1];
		}
		totalAlunos--;
	}

	public boolean contem(Aluno aluno) {// Verificando se o aluno existe no vetor
		for (int i = 0; i < totalAlunos; i++) {
			if (aluno.equals(alunos[i])) {
				return true;
			}
		}

		return false;
	}

	public int tamanho() {// Retorna o tamanho do vetor
		return totalAlunos;
	}

	public String toString() {
		return Arrays.toString(alunos);
	}

}

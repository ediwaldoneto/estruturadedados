package at01;

public class Exercicio03 {

	public static void main(String[] args) {

		int[] numeros = { 10, 20, 30, 50, 100, 250 };
		int maior = 0;
		int menor = 0;
		int x = 0;
		double media;

		menor = numeros[0];
		maior = numeros[0];
		for (int i = 0; i < numeros.length; i++) {
			x += numeros[i];
			if (numeros[i] < menor) {
				menor = numeros[i];

			}
			if (numeros[i] > maior) {
				maior = numeros[i];

			}

		}
		media = menor + maior / 2;
		System.out.println("Menor " + menor);
		System.out.println("Maior " + maior);
		System.out.println("Media " + media);
	}
}

public class Ordenacao {
	
	public static void bolha(int numeros[]) {
		int N, i, j, aux;
		N = numeros.length;

		for (i = 0; i < N - 1; i++)
			for (j = 0; j < (N - 1) - i; j++)
				if (numeros[j] > numeros[j + 1]) {
					aux = numeros[j];
					numeros[j] = numeros[j + 1];
					numeros[j + 1] = aux;
				}
	}

	public static void ordenacao(String vetPalavras[]) {

		int numero = vetPalavras.length;
		String aux;

		for (int i = 0; i < numero - 1; i++) {
			for (int j = 0; j < (numero - 1) - i; j++) {
				if (vetPalavras[j].compareTo(vetPalavras[j + 1]) > 0) {
					aux = vetPalavras[j];
					vetPalavras[j] = vetPalavras[j + 1];
					vetPalavras[j + 1] = aux;
				}
			}
		}
	}

}

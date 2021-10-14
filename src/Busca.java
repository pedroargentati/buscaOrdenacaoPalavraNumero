
public class Busca {

	public static int buscaBinaria(String buscaPalavra, String[] vetPalavras) {
		int i;

		for (i = 0; i < vetPalavras.length; i++)
			if (vetPalavras[i].equals(buscaPalavra))
				return i;
		return -1;
	}

	public static int buscaBinariaNum(int X, int numeros[]) {
		int i;

		for (i = 0; i < numeros.length; i++)
			if (numeros[i] == X)
				return i;

		return -1;
	}

}

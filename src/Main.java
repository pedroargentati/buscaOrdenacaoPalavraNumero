import java.util.Scanner;

public class Main {

	public static final int NUMEROS = 1;
	public static final int PALAVRAS = 2;
	public static final int SAIR = 3;

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int escolha = 0, quant = 0, posicao;

		boolean sair = false;

		do {
			System.out.println("\n\nO que deseja ordenar: ");
			System.out.println("  1- Números Inteiro");
			System.out.println("  2- Palavras");
			System.out.println("  3- Sair");

			System.out.print("\n** Informe a sua escolha: ");
			escolha = teclado.nextInt();

			try {
				switch (escolha) {
				case NUMEROS:
					System.out.print("Quantos números deseja ordenar: ");
					quant = teclado.nextInt();
					int vetNumero[] = new int[quant]; 

					for (int i = 0; i < vetNumero.length; i++) {
						System.out.print("Informe o " + (i + 1) + "° número: ");
						vetNumero[i] = teclado.nextInt();
					}

					Ordenacao.bolha(vetNumero);
					System.out.println("\nNúmeros ordenados: ");

					for (int i = 0; i < vetNumero.length; i++) {
						System.out.print(i != vetNumero.length - 1 ? vetNumero[i] + ", " : vetNumero[i]);
					}

					System.out.print("\n\nInforme o número que deseja pesquisar: ");
					int X = teclado.nextInt();

					posicao = Busca.buscaBinariaNum(X, vetNumero);

					if (posicao != -1)
						System.out.println("O número " + X + " está na posição " + posicao + ".");
					else
						System.out.println("O número " + X + " não está na relação.");

					break;

				case PALAVRAS:

					System.out.print("Quantas palavras deseja ordenar: ");
					quant = teclado.nextInt();
					teclado.nextLine();
					String[] vetPalavras = new String[quant];

					for (int i = 0; i < vetPalavras.length; i++) {
						System.out.print("Informe a " + (i + 1) + "° palavra: ");
						vetPalavras[i] = teclado.nextLine();
					}

					Ordenacao.ordenacao(vetPalavras);
					System.out.println("\n**Palavras ordenadas: ");

					for (int i = 0; i < vetPalavras.length; i++) {
						System.out.print(i != vetPalavras.length - 1 ? vetPalavras[i] + ", " : vetPalavras[i]);

					}

					String buscaPalavra = new String();
					System.out.print("\n\nInforme a palavra que deseja procurar: ");
					buscaPalavra = teclado.next();

					posicao = Busca.buscaBinaria(buscaPalavra, vetPalavras);
					
					if (posicao != -1)
						System.out.println("A palavra " + buscaPalavra + " está na posição " + posicao + ".");
					else
						System.out.println("A palavra " + buscaPalavra + " não está na relação.");

					break;

				case SAIR:
					sair = true;
					System.out.println("Programa finalizado.");
					System.exit(0);
					break;

				default:
					System.out.print("Opção inserida é inválida. Tente um valor entre (1 e 3).");

				}
			} catch (Exception e) {
				System.out.println("Exceção: Erro inesperado.");
				System.out.println("Erro: " + e.getMessage());
				e.printStackTrace(System.out);
			}
		} while (!sair);

		teclado.close();

	}

}

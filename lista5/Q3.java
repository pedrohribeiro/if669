package lista5;
import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// recebendo a paciencia
		Double paciencia = in.nextDouble();
		// recebendo a quantidade de pessoas
		int pessoas = in.nextInt();
		in.nextLine();
		// recebendo os nomes de cada pessoa

		Double resultado = 1.00;
		Double maiorDeTodas = -1.00;
		String maiorDeTodasNome = null;

		for (int i = 0; i < pessoas; i++) {
			long somatorioReal = 0;

			String nome = in.nextLine();

			if (nome.equals("Troy Bolton") || nome.equals("Gabriella Montez") || nome.equals("Sharpay Evans")
					|| nome.equals("Ryan Evans")) {

				int tamanho = nome.length();
				somatorioReal = somatorio(tamanho, nome);
				resultado = (somatorioReal * (paciencia * Math.pow(0.99, i))) + 350;
			} else {
				int tamanho = nome.length();
				somatorioReal = somatorio(tamanho, nome);
				resultado = somatorioReal * (paciencia * Math.pow(0.99, i));
			}

			if (resultado > maiorDeTodas) {
				maiorDeTodas = resultado;
				maiorDeTodasNome = nome;

			}
			//System.out.println(resultado);
		}
		System.out.printf("O grande vencedor(a) do papel principal desse ano foi %s!", maiorDeTodasNome);

	}

	public static long somatorio(int tamanho, String nome) {

		if (tamanho == 1) {
			return nome.charAt(0);
		} else {

			return nome.charAt(tamanho - 1) + somatorio(tamanho - 1, nome);
		}

	}
}


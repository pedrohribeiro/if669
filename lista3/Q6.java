package lista3;

import java.util.*;

public class Q6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int valorPont[] = new int[n];
		// achando a pontuação do alvo se for números pares OK
		if (n % 2 == 0) {
			for (int i = 0, valor = 1; valor <= n / 2; i++, valor++) {
				valorPont[i] = valor;
			}
			for (int i = (n / 2), valor = (n / 2); valor > 0; i++, valor--) {
				valorPont[i] = valor;
			}
		}
		// achando a pontuação do alvo se for números impares
		if (n % 2 == 1) {
			for (int i = 0, valor = 1; valor <= ((n / 2) + 1); i++, valor++) {
				valorPont[i] = valor;
			}
			for (int i = (n / 2), valor = ((n / 2) + 1); valor > 0; i++, valor--) {
				valorPont[i] = valor;
			}
		}
		// recebendo a quantidade de kunais
		int i = in.nextInt();
		int posicaoAcertoSasuke[] = new int[i];
		for (int j = 0; j < i; j++) {
			posicaoAcertoSasuke[j] = in.nextInt();
			for (int m = 0; m < posicaoAcertoSasuke.length; m++) {
				for (int k = 0; k < posicaoAcertoSasuke.length; k++) {
					if (m != k && posicaoAcertoSasuke[m] == posicaoAcertoSasuke[k]) {
						posicaoAcertoSasuke[k] = 0;

					}

				}
			}

		}

		int posicaoAcertoItachi[] = new int[i];
		for (int j = 0; j < i; j++) {
			posicaoAcertoItachi[j] = in.nextInt();
			for (int m = 0; m < posicaoAcertoItachi.length; m++) {
				for (int k = 0; k < posicaoAcertoItachi.length; k++) {
					if (m != k && posicaoAcertoItachi[m] == posicaoAcertoItachi[k]) {
						posicaoAcertoItachi[k] = 0;
					}
				}
			}
		}
		int somaPontSasuke = 0;
		int somaPontItachi = 0;

		for (int k = 1; k <= posicaoAcertoItachi.length; k++) {

			if (posicaoAcertoSasuke[k - 1] > n || posicaoAcertoSasuke[k - 1] < 1) {
				somaPontSasuke += 0;
			} else if (posicaoAcertoSasuke[k - 1] <= n) {
				somaPontSasuke += valorPont[posicaoAcertoSasuke[k - 1] - 1];
			}

		}
		for (int p = 1; p <= posicaoAcertoItachi.length; p++) {

			if (posicaoAcertoItachi[p - 1] > n || posicaoAcertoItachi[p - 1] < 1) {
				somaPontItachi += 0;
			} else if (posicaoAcertoItachi[p - 1] <= n) {

				somaPontItachi += valorPont[posicaoAcertoItachi[p - 1] - 1];
			}
		}
		// printando pontuacao
		System.out.printf("Sasuke: %d%n", somaPontSasuke);
		System.out.printf("Itachi: %d%n", somaPontItachi);

		if (somaPontSasuke > somaPontItachi) {
			System.out.println("Sasuke Uchiha");
		} else if (somaPontItachi > somaPontSasuke) {
			System.out.println("Itachi Uchiha");
		}
		if (somaPontSasuke > somaPontItachi && somaPontItachi == 0) {
			System.out.println("Um genjutsu desse nivel nao funciona em mim");
		} else if (somaPontItachi > somaPontSasuke && somaPontSasuke == 0) {
			System.out.println("Voce e fraco, lhe falta odio");
		}
		if (somaPontItachi == 0 && somaPontSasuke == 0) {
			System.out.println("Os Uchihas nem sao tao bons mesmo");
		}
		if (somaPontItachi != 0 && somaPontItachi != 0 && somaPontItachi == somaPontSasuke) {
			System.out.println("O empate nunca existiu, voce esta preso num genjutsu");
		}

	}
}

package lista4;

import java.util.*;

public class Q1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// recebendo o tamanho da matriz
		int n = in.nextInt();

		int matrizRyu[][] = new int[n][n];
		int matrizKen[][] = new int[n][n];
		int ataqueRyu = 0;
		int ataqueKen = 0;
		int defesaRyu = 0;
		int defesaKen = 0;
		double vidaRyu, vidaKen;
		// vidas deles
		vidaRyu = in.nextDouble();
		vidaKen = in.nextDouble();

		// montando a matriz de Ryu e achando o ataque
		for (int i = 0; i < matrizRyu.length; i++) {
			for (int j = 0; j < matrizRyu.length; j++) {
				matrizRyu[i][j] = in.nextInt();

				if (i == j) {
					ataqueRyu += matrizRyu[i][j];
				}
			}
		}
		// montando a matriz de Ken e achando o ataque
		for (int i = 0; i < matrizKen.length; i++) {
			for (int j = 0; j < matrizKen.length; j++) {
				matrizKen[i][j] = in.nextInt();

				if (i == j) {
					ataqueKen += matrizKen[i][j];
				}
			}
		}
		// achando a defesa de Ryu
		for (int i = 0, j = matrizRyu.length - 1; i < matrizRyu.length && j >= 0; i++, j--) {

			defesaRyu += matrizRyu[i][j];

		}
		// achando a defesa de Ken
		for (int i = 0, j = matrizKen.length - 1; i < matrizKen.length && j >= 0; i++, j--) {

			defesaKen += matrizKen[i][j];

		}

		// acoes a serem feitas

		int acoes;

		acoes = in.nextInt();

		for (int i = 0; i < acoes; i++) {

			String ryuCommand = in.next();
			String kenCommand = in.next();
			// fazendo as acoes
			if (ryuCommand.equals("A") && kenCommand.equals("A")) {
				if (ataqueRyu > ataqueKen) {

					vidaKen -= (ataqueRyu - ataqueKen);

				} else if (ataqueRyu < ataqueKen) {

					vidaRyu -= (ataqueKen - ataqueRyu);

				}

			}

			else if (ryuCommand.equals("A") && kenCommand.equals("D") && ataqueRyu > defesaKen) {

				vidaKen -= ((ataqueRyu - defesaKen) / 2);
			} else if (ryuCommand.equals("D") && kenCommand.equals("A") && ataqueKen > defesaRyu) {

				vidaRyu -= ((ataqueKen - defesaRyu) / 2);
			}
		}

		if (vidaRyu > vidaKen) {
			System.out.print("Ryu ganhou a batalha.");
		}

		else if (vidaKen > vidaRyu) {
			System.out.print("Ken ganhou a batalha.");
		} else if (vidaRyu == vidaKen) {
			System.out.print("Houve empate.");
		}
	}

}

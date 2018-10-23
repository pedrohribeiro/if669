package lista4;

import java.util.*;

public class Q3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int somaHorizontal = 0;
		int somaVertical = 0;
		int somaDiagonalInfDir = 0;

		// recebendo o tamanho da matriz
		int m = in.nextInt();
		int campo[][] = new int[m][m];

		// recebendo a quantidade de jogadas
		int j = in.nextInt();

		// montando a matriz
		for (int i = 0; i < campo.length; i++) {
			for (int j1 = 0; j1 < campo.length; j1++) {
				campo[i][j1] = in.nextInt();
			}
		}

		int x, y;

		// formando as jogadas
		for (int i = 0; i < j; i++) {
			x = in.nextInt();
			y = in.nextInt();

			// somando a horizontal

			if (campo[x][y] == -1) {
				System.out.println("Essa casa ja foi selecionada.");

			} else {
				for (int v = x, v1 = y; v1 < campo.length; v1++) {

					if (campo[v][v1] == -1) {
						somaHorizontal += 0;
					} else {
						somaHorizontal += campo[v][v1];
					}

				}

				// somando a vertical

				for (int h = x, h1 = y; h < campo.length; h++) {

					if (campo[h][h1] == -1) {
						somaVertical += 0;
					} else {
						somaVertical += campo[h][h1];
					}

				}

				// somando a diagonal inf dir

				for (int d = x, d1 = y; d < campo.length; d++, d1++) {

					if (campo[d][d1] == -1) {
						somaDiagonalInfDir += 0;
					} else {
						somaDiagonalInfDir += campo[d][d1];
					}

				}
			}

			if (somaHorizontal != somaVertical || somaHorizontal != somaDiagonalInfDir
					|| somaVertical != somaDiagonalInfDir) {

				System.out.printf("Boa jogada, a casa (%d,%d) nao tinha bomba.%n", x, y);

				campo[x][y] = -1;

			} else if (somaHorizontal == somaVertical && somaVertical == somaDiagonalInfDir) {
				i = j;
				System.out.println("Bomba encontrada.");
				System.out.print("Voce perdeu.");
			}
			
		}

	}

}

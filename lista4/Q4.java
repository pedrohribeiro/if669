package lista4;
import java.util.*;
public class Q4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int iAtual = 0, jAtual = 0;
		boolean parada = false;

		// recebendo o tamanho do mapa
		int m = in.nextInt();
		// recebendo a quantidade de movimentos
		int n = in.nextInt();

		in.nextLine();

		// formando a matriz mXm
		String mapa[][] = new String[m][m];

		/*
		 * * - representa um espa�o vazio no mapa, onde a cobra pode caminhar. # -
		 * representa um espa�o vazio no mapa, onde a cobra pode caminhar.
		 * 
		 * @ - obst�culo
		 */

		// montando a matriz

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				mapa[i][j] = in.next();

				if (mapa[i][j].equals("#")) {
					iAtual = i;
					jAtual = j;
				}
			}
		}

		// recebendo os movimentos e fazendo os movimentos

		for (int i = 0; i < n && !parada; i++) {

			String movimento = in.next();

			if (movimento.equals("D")) {
				if (mapa[iAtual][(jAtual + 1 + mapa.length) % mapa.length].equals("@")) {

					parada = true;

				}

				else {
					mapa[iAtual][jAtual] = "*";
					mapa[iAtual][(jAtual + 1 + mapa.length) % mapa.length] = "#";
					jAtual = ((jAtual + 1 + mapa.length) % mapa.length);

				}

			}

			else if (movimento.equals("E")) {
				if (mapa[iAtual][(jAtual - 1 + mapa.length) % mapa.length].equals("@")) {

					parada = true;

				}

				else {
					mapa[iAtual][jAtual] = "*";
					mapa[iAtual][(jAtual - 1 + mapa.length) % mapa.length] = "#";
					jAtual = ((jAtual - 1 + mapa.length) % mapa.length);
				}

			}

			else if (movimento.equals("C")) {
				if (mapa[(iAtual - 1 + mapa.length) % mapa.length][jAtual].equals("@")) {

					parada = true;

				}

				else {
					mapa[iAtual][jAtual] = "*";
					mapa[(iAtual - 1 + mapa.length) % mapa.length][jAtual] = "#";
					iAtual = ((iAtual - 1 + mapa.length) % mapa.length);
				}


			}

			else if (movimento.equals("B")) {
				if (mapa[(iAtual + 1 + mapa.length) % mapa.length][jAtual].equals("@")) {

					parada = true;

				}

				else {
					mapa[iAtual][jAtual] = "*";
					mapa[(iAtual + 1 + mapa.length) % mapa.length][jAtual] = "#";
					iAtual = ((iAtual + 1 + mapa.length) % mapa.length);
				}

			}

		}

		for (int i = 0; i < mapa.length; i++) {
			for (int j = 0; j < mapa.length - 1; j++) {
				System.out.print(mapa[i][j] + " ");
			}
			System.out.println(mapa[i][mapa.length - 1]);

		}
		if (parada == true) {
			System.out.print("Game over.");
		}

	}

}

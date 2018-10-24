package lista5;
import java.util.*;
public class Q4 {

	static boolean achado = false;
	static boolean continua = false;
	static boolean pego = false;
	static boolean endoidou = false;
	static int coordX;
	static int coordY;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int x = in.nextInt();
		int y = in.nextInt();
		int linhas = x - 1;
		int colunas = y - 1;

		int corredores[][] = new int[x][y];

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				corredores[i][j] = in.nextInt();

			}

		}

		if (x == 0 && y == 0) {
			System.out.print("Sharpay endoidou!");
		} else {
			verificacao(corredores, 0, 0, linhas, colunas);
			if (achado) {
				System.out.printf("O armario a ser invadido fica no corredor %d, e e o armario de numero %d.", coordX,
						coordY);
			}

			else if (pego) {
				System.out.printf("Voce foi descoberto! Corra dancando Bop To the Top!!");
			}

			else if (achado == false && pego == false && continua == true) {
				System.out.print("Sharpay endoidou!");
			}

			else if (x == 0 && y == 0) {
				System.out.print("Sharpay endoidou!");
			}
		}
	}

	public static boolean verificacao(int corredores[][], int x, int y, int linhas, int colunas) {

		if (corredores[x][y] == 0) {
			achado = true;
			coordX = x + 1;
			coordY = y + 1;
			// System.out.println("a");
			return true;

		}

		else if (corredores[x][y] == -1) {
			pego = true;
			// System.out.println("b");
			return true;
		}

		else if (corredores[x][y] > 0 && x < linhas && y < colunas) {
			continua = true;
			// System.out.println("c");
			return verificacao(corredores, x + 1, y, linhas, colunas);

		}

		else if (corredores[x][y] > 0 && x == linhas) {
			continua = true;
			// System.out.println("d");
			return verificacao(corredores, 0, y + 1, linhas, colunas);
		}

		return true;
	}

}

package lista4;

import java.util.*;

public class Q2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String jogadores[][] = new String[3][3];

		for (int i = 0; i < jogadores.length; i++) {
			for (int j = 0; j < jogadores.length; j++) {
				jogadores[i][j] = in.next();
			}
		}

		String auxiliar;

		// trocando 01 com 10
		auxiliar = jogadores[0][1];
		jogadores[0][1] = jogadores[1][0];
		jogadores[1][0] = auxiliar;

		// trocando 02 com 20
		auxiliar = jogadores[0][2];
		jogadores[0][2] = jogadores[2][0];
		jogadores[2][0] = auxiliar;

		// trocando 12 com 21

		auxiliar = jogadores[1][2];
		jogadores[1][2] = jogadores[2][1];
		jogadores[2][1] = auxiliar;

		for (int i = 0; i < jogadores.length; i++) {

			System.out.printf("%s %s %s%n", jogadores[i][0], jogadores[i][1], jogadores[i][2]);

		}

	}

}

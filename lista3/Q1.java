package lista3;

import java.util.*;

public class Q1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int V = in.nextInt(), D = in.nextInt();
		int dias[] = new int[D];
		int precoTotal = 0;
		int tigelas = 0;
		for (int i = 0; D > i; i++) {
			tigelas = in.nextInt();
			dias[i] = tigelas;
			if (tigelas == 1) {
				precoTotal += 10;
			}

			else if (tigelas >= 2 && tigelas <= 10) {
				precoTotal += 9 * tigelas;
			} else if (tigelas > 10) {
				precoTotal += 8 * tigelas;
			}
		}
		int falta = (precoTotal - V);
		if (tigelas == 0) {
			System.out.print("Naruto nao apareceu para comer");
		}

		else if (precoTotal <= V) {
			System.out.print("Naruto conseguiu pagar a sua conta!");
		} else if (precoTotal > V) {
			System.out.printf("Naruto, faltam %d ryos!", falta);
		}

	}

}

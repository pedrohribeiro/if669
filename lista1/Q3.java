package lista1;

import java.util.*;

public class Q3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int M = in.nextInt(), // n?mero de moedas que M?rio possui.
				A = in.nextInt(), // Verde - 80K/h
				B = in.nextInt(), // Vermelho - 100K/h
				C = in.nextInt(), // Roxo - 120K/h
				D = in.nextInt(), // Amarelo - 80k/h
				Verde = 80 / A, Vermelho = 100 / B, Roxo = 120 / C, Amarelo = 80 / D;

		if (M < A && M < B && M < C && M < D) {
			System.out.println("Acho que vou a pe :(");
		}

		else if (Verde >= Vermelho && Verde >= Roxo && Verde >= Amarelo) {
			System.out.print("Verde");
		}

		else if (Vermelho >= Roxo && Vermelho >= Amarelo && Vermelho > Verde) {
			System.out.print("Vermelho");
		}

		else if (Roxo >= Amarelo && Roxo > Verde && Roxo > Vermelho) {
			System.out.print("Roxo");
		}

		else if (Amarelo > Verde && Amarelo > Vermelho && Amarelo > Roxo) {
			System.out.print("Amarelo");
		}

	}

}

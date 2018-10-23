package lista1;

import java.util.*;

public class Q9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int C, L, X, Y;
		String Tipo;

		C = in.nextInt();
		L = in.nextInt();
		in.nextLine();
		Tipo = in.nextLine();
		X = in.nextInt();
		Y = in.nextInt();

		if (Tipo.equals("Saque") && (X < C / 2 && X >= C / 4 && Y <= L)) {
			System.out.print("A bola foi rebatida");
		} else if (Tipo.equals("Saque") && (X >= C / 2 || X < C / 4 || Y > L)) {
			System.out.print("A bola foi para fora");
		}

		else if (Tipo.equals("Bola Normal") && (X < C / 2 && X >= 0) && (Y <= L)) {
			System.out.print("A bola foi rebatida");
		} else if (Tipo.equals("Bola Normal") && (X >= C / 2 || X < 0 || Y > L)) {
			System.out.print("A bola foi para fora");
		}

	}

}

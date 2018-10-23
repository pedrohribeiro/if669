package lista1;

import java.util.*;

public class Q4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String P, L, S;
		P = in.nextLine();
		L = in.nextLine();
		S = in.nextLine();

		if ((P.charAt(0) == 'F' || P.charAt(0) == 'f')
				&& (P.charAt(P.length() - 1) == 'R' || P.charAt(P.length() - 1) == 'r')) {
			System.out.print("Direita");
		} else if ((L.charAt(0) == 'F' || L.charAt(0) == 'f')
				&& (L.charAt(L.length() - 1) == 'R' || L.charAt(L.length() - 1) == 'r')) {
			System.out.print("Meio");
		} else if ((S.charAt(0) == 'F' || S.charAt(0) == 'f')
				&& (S.charAt(S.length() - 1) == 'R' || S.charAt(S.length() - 1) == 'r')) {
			System.out.print("Esquerda");
		}

		else
			System.out.print("Vou em frente");

	}

}

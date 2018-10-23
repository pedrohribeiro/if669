package lista3;

import java.util.*;

public class Q3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String nomePart = "";
		String s = in.nextLine();
		int n = in.nextInt();
		String participantes[] = new String[n];
		int chakraArray[] = new int[n];
		int jutsuArray[] = new int[n];
		int jutsuArrayInv[] = new int[n];
		int potencial[] = new int[n];
		int k;
		int i = 0;
		if (s.equals("Esse naruto...")) {
			for (k = n - 1, i = 0; k >= 0; k--, i++) {
				participantes[i] = in.next();
				chakraArray[i] = in.nextInt();
				jutsuArrayInv[k] = in.nextInt();
			}
			for (k = n - 1; k >= 0; k--) {
				potencial[k] = chakraArray[k] - jutsuArrayInv[k];
			}
		}

		else if (s.equals("Tudo certo")) {
			for (k = 0; k < n; k++) {
				nomePart = in.next();
				participantes[k] = nomePart;
				chakraArray[k] = in.nextInt();
				jutsuArray[k] = in.nextInt();
				potencial[k] = chakraArray[k] - jutsuArray[k];
			}
		}

		for (i = 0; i < n; i++) {
			for (k = 0; k < n - 1; k++) {
				if (potencial[k] <= potencial[k + 1]) {
					int temp = potencial[k];
					potencial[k] = potencial[k + 1];
					potencial[k + 1] = temp;
					String part = participantes[k];
					participantes[k] = participantes[k + 1];
					participantes[k + 1] = part;
				}
			}

		}
		/*
		 * for(i = 0; i < n; i++) { //System.out.println(participantes[i]);
		 * //System.out.println(potencial[i]); }
		 */
		int quantidade = 0;
		for (i = 0; i < n; i++) {
			if (potencial[i] > 0) {
				System.out.printf("%s esta classificado(a)%n", participantes[i]);
				quantidade++;
			} else {
				System.out.printf("%s esta desclassificado(a)%n", participantes[i]);
			}
		}
		if (quantidade == 0) {
			System.out.println("\nEsse semestre ninguem veio treinar na aldeia da folha");
		} else {
			System.out.printf("%nKakashi tera um total de %d aluno(s) nesse semestre", quantidade);
		}

	}

}

package lista1;

import java.util.*;

public class Q10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String Curva11, Curva12, Curva13, Curva14, Curva21, Curva22, Curva23, Curva24, Curva31, Curva32, Curva33,
				Curva34, Curva41, Curva42, Curva43, Curva44;
		int Dist11, Dist12, Dist13, Dist14, Dist21, Dist22, Dist23, Dist24, Dist31, Dist32, Dist33, Dist34, Dist41,
				Dist42, Dist43, Dist44;
		boolean buracoMario = false, buracoYoshi = false, buracoToad = false;

		Curva11 = in.next();
		Dist11 = in.nextInt();
		Curva12 = in.next();
		Dist12 = in.nextInt();
		Curva13 = in.next();
		Dist13 = in.nextInt();
		Curva14 = in.next();
		Dist14 = in.nextInt();
		Curva21 = in.next();
		Dist21 = in.nextInt();
		Curva22 = in.next();
		Dist22 = in.nextInt();
		Curva23 = in.next();
		Dist23 = in.nextInt();
		Curva24 = in.next();
		Dist24 = in.nextInt();
		Curva31 = in.next();
		Dist31 = in.nextInt();
		Curva32 = in.next();
		Dist32 = in.nextInt();
		Curva33 = in.next();
		Dist33 = in.nextInt();
		Curva34 = in.next();
		Dist34 = in.nextInt();

		if (Curva11.equals("Esquerda") && Curva12.equals("Esquerda") && Curva13.equals("Esquerda")
				|| Curva12.equals("Esquerda") && Curva13.equals("Esquerda") && Curva14.equals("Esquerda")) {
			System.out.println("Mario caiu em um buraco negro.");
			buracoMario = true;
		}

		if (Curva21.equals("Esquerda") && Curva22.equals("Esquerda") && Curva23.equals("Esquerda")
				|| Curva22.equals("Esquerda") && Curva23.equals("Esquerda") && Curva24.equals("Esquerda")) {
			System.out.println("Yoshi caiu em um buraco negro.");
			buracoYoshi = true;
		}

		if (Curva31.equals("Esquerda") && Curva32.equals("Esquerda") && Curva33.equals("Esquerda")
				|| Curva32.equals("Esquerda") && Curva33.equals("Esquerda") && Curva34.equals("Esquerda")) {
			System.out.println("Toad caiu em um buraco negro.");
			buracoToad = true;
		}

		if (((Dist11 + Dist12 + Dist13 + Dist14) <= (Dist21 + Dist22 + Dist23 + Dist24)
				&& (Dist11 + Dist12 + Dist13 + Dist14) <= (Dist31 + Dist32 + Dist33 + Dist34) && (buracoMario == false))
				|| ((buracoMario == false) && (buracoYoshi == true) && (buracoToad == true))
				|| ((buracoMario == false) && (buracoYoshi == false) && (buracoToad == true))
						&& ((Dist11 + Dist12 + Dist13 + Dist14) <= (Dist21 + Dist22 + Dist23 + Dist24))
				|| ((buracoMario == false) && (buracoYoshi == true && (buracoToad == false))
						&& ((Dist11 + Dist12 + Dist13 + Dist14) <= (Dist31 + Dist32 + Dist33 + Dist34)))) {
			System.out.println("Mario venceu a corrida!");
		}

		if (((Dist21 + Dist22 + Dist23 + Dist24) <= (Dist11 + Dist12 + Dist13 + Dist14)
				&& (Dist21 + Dist22 + Dist23 + Dist24) <= (Dist31 + Dist32 + Dist33 + Dist34) && (buracoYoshi == false))
				|| ((buracoMario == true) && (buracoYoshi == false) && (buracoToad == true))
				|| ((buracoMario == false) && (buracoYoshi == false) && (buracoToad == true))
						&& ((Dist21 + Dist22 + Dist23 + Dist24) <= (Dist11 + Dist12 + Dist13 + Dist14))
				|| (((buracoMario == true) && (buracoYoshi == false) && (buracoToad == false))
						&& ((Dist21 + Dist22 + Dist23 + Dist24) <= (Dist31 + Dist32 + Dist33 + Dist34)))) {
			System.out.println("Yoshi venceu a corrida!");
		}

		if (((Dist31 + Dist32 + Dist33 + Dist34) <= (Dist11 + Dist12 + Dist13 + Dist14)
				&& (Dist31 + Dist32 + Dist33 + Dist34) <= (Dist21 + Dist22 + Dist23 + Dist24) && (buracoToad == false))
				|| ((buracoMario == true) && (buracoYoshi == true) && (buracoToad == false))
				|| ((buracoMario == true) && (buracoYoshi == false) && (buracoToad == false))
						&& ((Dist31 + Dist32 + Dist33 + Dist34) <= (Dist21 + Dist22 + Dist23 + Dist24))
				|| (((buracoMario == false) && (buracoYoshi == true) && (buracoToad == false))
						&& ((Dist31 + Dist32 + Dist33 + Dist34) <= (Dist11 + Dist12 + Dist13 + Dist14)))) {
			System.out.println("Toad venceu a corrida!");
		}

	}

}

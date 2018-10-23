package lista1;

import java.util.*;

public class Q7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String H, I; // Mario (FireFlower=73, IceFlower=50, BoomerangFlower=32)
		int L; // Luigi (FireFlower=70, IceFlower=45, BoomerangFlower=28)

		H = in.next();
		I = in.next();
		L = in.nextInt();

		if (H.equals("Mario")) {
			if (I.equals("FireFlower"))
				if (73 * 4 >= L) {
					System.out.print("Mario conseguiu derrotar o Bowser e salvar a princesa Peach.");
				} else {
					System.out.print("O Bowser conseguiu escapar.");
				}

			if (I.equals("IceFlower"))
				if (50 * 4 >= L) {
					System.out.print("Mario conseguiu derrotar o Bowser e salvar a princesa Peach.");
				} else {
					System.out.print("O Bowser conseguiu escapar.");
				}
			if (I.equals("BoomerangFlower"))
				if (32 * 4 >= L) {
					System.out.print("Mario conseguiu derrotar o Bowser e salvar a princesa Peach.");
				} else {
					System.out.print("O Bowser conseguiu escapar.");
				}
		}
		if (H.equals("Luigi")) {
			if (I.equals("FireFlower"))
				if (70 * 4 >= L) {
					System.out.print("Luigi conseguiu derrotar o Bowser e salvar a princesa Peach.");
				} else {
					System.out.print("O Bowser conseguiu escapar.");
				}

			if (I.equals("IceFlower"))
				if (45 * 4 >= L) {
					System.out.print("Luigi conseguiu derrotar o Bowser e salvar a princesa Peach.");
				} else {
					System.out.print("O Bowser conseguiu escapar.");
				}
			if (I.equals("BoomerangFlower"))
				if (28 * 4 >= L) {
					System.out.print("Luigi conseguiu derrotar o Bowser e salvar a princesa Peach.");
				} else {
					System.out.print("O Bowser conseguiu escapar.");
				}
		}

	}

}

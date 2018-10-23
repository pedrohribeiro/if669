package lista2;

import java.util.*;

public class Q4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double D = in.nextDouble();
		int CC = 0;
		int EC = 0;
		int outros = 0;

		while (in.hasNext()) {
			String curso = in.next();
			String nome = in.nextLine();

			if (curso.equals("CC")) {
				CC++;
			} else if (curso.equals("EC")) {
				EC++;
			} else {
				outros++;
			}
		}

		if (((CC * 5) + (EC * 10) + (outros * 15)) >= D) {
			System.out.print("Cebruthius!");
		} else {
			System.out.print("Escamou!");
		}

	}

}

package lista3;

import java.util.*;

public class Q2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String nome[] = new String[8];
		String nomeJogador;

		for (int i = 0; i < 8; i++) {
			nomeJogador = in.nextLine();
			nome[i] = nomeJogador;
		}

		int i0, i1, i2, i3, i4, i5, i6, i7;

		i0 = in.nextInt();
		i1 = in.nextInt();
		i2 = in.nextInt();
		i3 = in.nextInt();
		i4 = in.nextInt();
		i5 = in.nextInt();
		i6 = in.nextInt();
		i7 = in.nextInt();

		String q1, q2, q3, q4;

		q1 = in.next();
		q2 = in.next();
		q3 = in.next();
		q4 = in.next();
		String vencedor1 = "";
		String vencedor2 = "";
		String vencedor3 = "";
		String vencedor4 = "";

		if (q1.equals("A")) {
			vencedor1 = nome[i0];
		} else {
			vencedor1 = nome[i1];
		}
		if (q2.equals("A")) {
			vencedor2 = nome[i2];
		} else {
			vencedor2 = nome[i3];
		}
		if (q3.equals("A")) {
			vencedor3 = nome[i4];
		} else {
			vencedor3 = nome[i5];
		}
		if (q4.equals("A")) {
			vencedor4 = nome[i6];
		} else {
			vencedor4 = nome[i7];
		}

		String s1, s2;

		s1 = in.next();
		s2 = in.next();

		String venceSemi1 = "";
		String venceSemi2 = "";

		if (s1.equals("X")) {
			venceSemi1 = vencedor1;
		} else {
			venceSemi1 = vencedor2;
		}

		if (s2.equals("X")) {
			venceSemi2 = vencedor3;
		} else {
			venceSemi2 = vencedor4;
		}
		String v;

		v = in.next();

		String venceFinal = "";

		if (v.equals("#")) {
			venceFinal = venceSemi1;
		} else {
			venceFinal = venceSemi2;
		}

		System.out.println("Bem vindos ao Exame Chunnin!");
		System.out.printf("Quartas de final 1: %s x %s%n", nome[i0], nome[i1]);
		System.out.printf("Quartas de final 2: %s x %s%n", nome[i2], nome[i3]);
		System.out.printf("Quartas de final 3: %s x %s%n", nome[i4], nome[i5]);
		System.out.printf("Quartas de final 4: %s x %s%n", nome[i6], nome[i7]);
		System.out.printf("Semifinal 1: %s x %s%n", vencedor1, vencedor2);
		System.out.printf("Semifinal 2: %s x %s%n", vencedor3, vencedor4);
		System.out.printf("Final: %s x %s%n", venceSemi1, venceSemi2);
		System.out.printf("O grande vencedor e %s!", venceFinal);

	}

}

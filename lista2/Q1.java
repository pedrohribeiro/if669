package lista2;

import java.util.*;

public class Q1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int outros = 0;
		int Anitta = 0;
		int Jojo = 0;
		int Kevinho = 0;
		int Livinho = 0;
		int Ludmilla = 0;

		int n = in.nextInt();

		for (int i = 0; i < n; i++) {
			String artista = in.next();
			if (artista.equals("Anitta")) {
				Anitta++;
			}

			else if (artista.equals("Ludmilla")) {
				Ludmilla++;
			}

			else if (artista.equals("Jojo")) {
				Jojo++;
			}

			else if (artista.equals("Kevinho")) {
				Kevinho++;
			}

			else if (artista.equals("Livinho")) {
				Livinho++;
			}

			else {
				outros++;
			}
		}

		if (Anitta >= Jojo && Anitta >= Kevinho && Anitta >= Livinho && Anitta >= Ludmilla && Anitta >= outros) {
			if (Anitta == Jojo) {
				System.out.print("Houve um empate entre: Anitta, Jojo");
			} else if (Anitta == Kevinho) {
				System.out.print("Houve um empate entre: Anitta, Kevinho");
			} else if (Anitta == Livinho) {
				System.out.print("Houve um empate entre: Anitta, Livinho");
			} else if (Anitta == Ludmilla) {
				System.out.print("Houve um empate entre: Anitta, Ludmilla");
			} else {
				System.out.print("As pessoas estao esperando por Anitta.");
			}
		}

		else if (Jojo >= Anitta && Jojo >= Kevinho && Jojo >= Livinho && Jojo >= Ludmilla && Jojo >= outros) {
			if (Jojo == Kevinho) {
				System.out.print("Houve um empate entre: Jojo, Kevinho");
			} else if (Jojo == Livinho) {
				System.out.print("Houve um empate entre: Jojo, Livinho");
			} else if (Jojo == Ludmilla) {
				System.out.print("Houve um empate entre: Jojo, Ludmilla");
			} else {
				System.out.print("As pessoas estao esperando por Jojo.");
			}
		}

		else if (Kevinho >= Anitta && Kevinho >= Jojo && Kevinho >= Livinho && Kevinho >= Ludmilla
				&& Kevinho >= outros) {
			if (Kevinho == Livinho) {
				System.out.print("Houve um empate entre: Kevinho, Livinho");
			} else if (Kevinho == Ludmilla) {
				System.out.print("Houve um empate entre: Kevinho, Ludmilla");
			} else {
				System.out.print("As pessoas estao esperando por Kevinho.");
			}
		}

		else if (Livinho >= Anitta && Livinho >= Jojo && Livinho >= Kevinho && Livinho >= Ludmilla
				&& Livinho >= outros) {
			if (Livinho == Ludmilla) {
				System.out.print("Houve um empate entre: Livinho, Ludmilla");
			} else {
				System.out.print("As pessoas estao esperando por Livinho.");
			}
		} else if (Ludmilla > Anitta && Ludmilla > Jojo && Ludmilla > Kevinho && Ludmilla > Livinho
				&& Ludmilla > outros) {
			System.out.print("As pessoas estao esperando por Ludmilla.");
		}

		else {
			System.out.print("As pessoas querem ver outra pessoa");
		}

	}

}

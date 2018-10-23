package lista3;
import java.util.*;
public class Q4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		boolean temJounin = false;

		int quantNinjas = Integer.parseInt(in.nextLine());
		int n, sap, cob, les, mac, cae;
		String nomeNinja[] = new String[quantNinjas];
		String caract[] = new String[quantNinjas];
		String sapos[] = new String[quantNinjas];
		String cobras[] = new String[quantNinjas];
		String lesmas[] = new String[quantNinjas];
		String macacos[] = new String[quantNinjas];
		String caes[] = new String[quantNinjas];

		for (n = 0; n < quantNinjas; n++) {
			nomeNinja[n] = "";
			caract[n] = "";
		}

		for (n = 0; n < quantNinjas; n++) {
			String frase = in.nextLine();
			String palavras[] = frase.split(" ");
			if (palavras.length == 1) {

			} else if (palavras.length == 2) {
				nomeNinja[n] = palavras[0];
				caract[n] = palavras[1];

			}
		}
		sap = 0;
		cob = 0;
		les = 0;
		mac = 0;
		cae = 0;
		for (n = 0; n < quantNinjas; n++) {
			if (!caract[n].equals("")) {
				if (caract[n].equals("Coragem") || caract[n].equals("Determinacao") || caract[n].equals("Conviccao")) {
					sapos[sap] = nomeNinja[n];
					sap++;
					temJounin = true;
				} else if (caract[n].equals("Ambicao") || caract[n].equals("Astucia")
						|| caract[n].equals("Expertise")) {
					cobras[cob] = nomeNinja[n];
					cob++;
					temJounin = true;
				} else if (caract[n].equals("Analise") || caract[n].equals("Suporte") || caract[n].equals("Tecnica")) {
					lesmas[les] = nomeNinja[n];
					les++;
					temJounin = true;
				} else if (caract[n].equals("Agilidade") || caract[n].equals("Inteligencia")
						|| caract[n].equals("Destreza")) {
					macacos[mac] = nomeNinja[n];
					mac++;
					temJounin = true;
				} else if (caract[n].equals("Experiencia") || caract[n].equals("Perspicacia")
						|| caract[n].equals("Pericia")) {
					caes[cae] = nomeNinja[n];
					cae++;
					temJounin = true;
				}
			}
		}
		if (temJounin) {
			System.out.println("Sapos:");
			for (int j = 0; j < sap; j++) {
				System.out.printf("- %s%n", sapos[j]);
			}
			System.out.println("Cobras:");
			for (int j = 0; j < cob; j++) {
				System.out.printf("- %s%n", cobras[j]);
			}
			System.out.println("Lesmas:");
			for (int j = 0; j < les; j++) {
				System.out.printf("- %s%n", lesmas[j]);
			}
			System.out.println("Macacos:");
			for (int j = 0; j < mac; j++) {
				System.out.printf("- %s%n", macacos[j]);
			}
			System.out.println("Caes:");
			for (int j = 0; j < cae; j++) {
				System.out.printf("- %s%n", caes[j]);
			}
		} else
			System.out.println("Nao havera Jounins forte esse ano");

	}

}

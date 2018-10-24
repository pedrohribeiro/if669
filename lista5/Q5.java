package lista5;
import java.util.*;
public class Q5 {
	static String concat = "";

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int pessoas = in.nextInt();

		int porcao[] = new int[pessoas];
		String nome[] = new String[pessoas];

		for (int i = 0; i < pessoas; i++) {
			nome[i] = in.next();
			porcao[i] = in.nextInt();
		}
		print(nome, porcao, 0, pessoas);
		System.out.print(concat);
	}

	public static String print(String nome[], int porcao[], int i, int pessoas) {

		if (i < porcao.length && porcao[i] > 0) {
			concat = nome[i] + " foi servido(a)." + '\n' + concat;
			porcao[i] -= 400;
			if (porcao[i] > 0) {
				concat = "Fica tranquilo(a), " + nome[i] + " pode se servir novamente!" + '\n' + concat;
				concat = print(nome, porcao, i, pessoas);

			}else {
				return print(nome, porcao, i + 1, pessoas);
			}
		} 
		return concat;



	}
}
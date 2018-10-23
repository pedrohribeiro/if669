package lista3;

import java.util.*;

public class Q7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int pessoasAmarradas[] = new int[n];
		int somaPoderCombate = -999999;
		int somaParcial = 0;
		int posicaoInicial = 0;
		int posicaoFinal = 0;

		for (int i = 0; i < pessoasAmarradas.length; i++) {

			pessoasAmarradas[i] = in.nextInt();
			somaPoderCombate += pessoasAmarradas[i];

		}

		for (int i = 0; i < pessoasAmarradas.length; i++) {
			for (int j = i; j < pessoasAmarradas.length; j++) {
				somaParcial += pessoasAmarradas[j];
				posicaoFinal = j;
				if (somaParcial > somaPoderCombate) {
					somaPoderCombate = somaParcial;
					posicaoInicial = i;
					posicaoFinal = j;
				}
			}			
		}
		if (somaParcial < 0) {
			System.out.println("E uma armadilha");
		}
		else if(posicaoInicial == posicaoFinal) {
			System.out.printf("Naruto deve libertar somente a posicao %d", posicaoInicial);
		}
		else if(somaParcial > 0) {
			System.out.printf("Naruto deve libertar da posicao %d ate a posicao %d", posicaoInicial, posicaoFinal);
		}

		
	}

}

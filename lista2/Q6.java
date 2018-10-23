package lista2;

import java.util.*;

public class Q6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int X = in.nextInt();
		int T = in.nextInt();
		double expressao = 0;
		double resultadofatorial = 1;
		double V = X;
		if (T == 0) {
			V = 0;
		} else {
			for (int i = 2, j = 3, c = 0; c < T - 1; i += 2, j += 2, c++) {
				resultadofatorial = 1;
				for (int k = j; k > 0; k--) {
					resultadofatorial = resultadofatorial * k;
				}

				if (c % 2 == 0) {
					expressao -= ((Math.pow(X, i)) / (resultadofatorial));
				} else {
					expressao += ((Math.pow(X, i)) / (resultadofatorial));
				}
				V += expressao;
				expressao = 0;
			}
		}
		V = Math.abs(V);
		System.out.printf("%.03f", V);

	}

}

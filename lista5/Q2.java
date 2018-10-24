package lista5;
import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		long voltas;
		long totalVoltas = 0;

		while (in.hasNext()) {
			voltas = in.nextInt();
			totalVoltas += voltas;
			long cestas = fatorial(voltas);

			if (cestas < 50) {
				long dobroCestas = cestas * 2;

				System.out.printf("%d%n", dobroCestas);

			} 
			else if (cestas >= 50) {
				System.out.printf("%d%n", cestas);
			}

		}

		if (totalVoltas > 100) {
			System.out.print("WildCats, get the head in the game!");
		}

	}

	public static long fatorial(long n) {

		if (n == 0) {
			return 1;
		} else {
			return n * fatorial(n - 1);
		}

	}
}


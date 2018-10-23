package lista1;

import java.util.*;

public class Q5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int X, Y, Z;
		X = in.nextInt();
		Y = in.nextInt();
		Z = in.nextInt();

		if (X >= Y && X >= Z) {
			if (Y >= Z)
				System.out.printf("%d %d %d", X, Y, Z);
			else
				System.out.printf("%d %d %d", X, Z, Y);
		}

		if (Y > X && Y >= Z) {
			if (X >= Z)
				System.out.printf("%d %d %d", Y, X, Z);
			else
				System.out.printf("%d %d %d", Y, Z, X);
		}

		if (Z > X && Z > Y) {
			if (X > Y)
				System.out.printf("%d %d %d", Z, X, Y);
			else
				System.out.printf("%d %d %d", Z, Y, X);
		}

	}

}

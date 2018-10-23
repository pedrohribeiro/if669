package lista3;
import java.util.*;
public class Q5 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);

			int t = in.nextInt();
			int array[] = new int[t];

			for (int i = 0; i < array.length; i++) {
				array[i] = in.nextInt();
			}

			int x = in.nextInt();

			int somaArray = 0;
			for (int i = 0; i < array.length; i++) {
				somaArray += array[i];
			}

			if (somaArray == 0) {
				for (int i = 0; i < array.length; i++) {
					int auxiliar = 0;
					int volta = 0;
					auxiliar += array[i];
					System.out.printf("%d %d", i, volta);
				}
			} else {

				boolean check = false;
				int auxiliar = 0;
				int volta = 0;
				while (auxiliar < x) {
					for (int i = 0; i < array.length; i++) {

						auxiliar += array[i];
						if (auxiliar == x) {

							System.out.printf("%d %d", i, volta);
							check = true;
						}

					}
					volta++;
				}
				if (!check) {
					System.out.println("Esse numero deve estar errado...");

				}

			}
			if (somaArray < 0) {
				int auxiliar = 0;
				int volta = 0;
				for (int i = 0; i < array.length; i++) {
					auxiliar += array[i];
					if (auxiliar == x) {

						System.out.printf("%d %d", i, volta);

					}

				}

			}

	}

}

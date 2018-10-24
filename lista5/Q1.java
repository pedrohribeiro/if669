package lista5;
import java.util.*;
public class Q1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Double vergonhaTroy = in.nextDouble();
		int bebidasTroy = in.nextInt();
		Double vergonhaGabi = in.nextDouble();
		int bebidasGabi= in.nextInt();
		int resultado1 = fibonacci(bebidasTroy);
		int resultado2 = fibonacci(bebidasGabi);

		if (vergonhaTroy > resultado1) {
			System.out.println("Nao foi dessa vez!! Troy nao teve coragem o suficiente.");
		}
		else {
			System.out.println("Esse pode ser o comeco de algo novo!! Troy vai cantar!!");
		}
		if(vergonhaGabi > resultado2) {
			System.out.println("Nao foi dessa vez!! Gabriella nao teve coragem o suficiente.");
		}
		else {
			System.out.println("Esse pode ser o comeco de algo novo!! Gabriella vai cantar!!");
		}
	}

	public static int fibonacci(int n) {

		if(n == 0) {
			return 0;
		}
		else if(n == 1) {
			return 1;
		}
		else{
			return fibonacci(n-1) + fibonacci(n-2);			
		}

	}
}
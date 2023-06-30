package estruturaCondicional;

import java.util.Scanner;

/*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.*/

public class Exe02 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int i = scanner.nextInt();

		if (i % 2 == 0) {
			System.out.println("PAR");

		} else {
			System.out.println("IMPAR");
		}
		scanner.close();

	}
}

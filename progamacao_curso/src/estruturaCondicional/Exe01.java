package estruturaCondicional;

import java.util.Scanner;
/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.*/

public class Exe01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int i = scanner.nextInt();

		if (i < 0) {
			System.out.println("NEGATIVO");

		} else {
			System.out.println("NÃO NEGATIVO");
		}

		scanner.close();
	}

}

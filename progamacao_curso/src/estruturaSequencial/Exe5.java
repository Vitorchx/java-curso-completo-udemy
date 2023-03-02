package estruturaSequencial;
/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/

import java.util.Scanner;

public class Exe5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cod1, cod2, quantidade1, quantidade2;
		double preco1, preco2, total;
		cod1 = scanner.nextInt();
		quantidade1 = scanner.nextInt();
		preco1 = scanner.nextDouble();

		cod2 = scanner.nextInt();
		quantidade2 = scanner.nextInt();
		preco2 = scanner.nextDouble();

		total = quantidade1 * preco1 + quantidade2 * preco2;

		System.out.printf("Total = %.2f%n ", total);

	}

}

package exeRetanguloFixa;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Retangulo rect = new Retangulo();

		System.out.println("Entre com  largura e altura do retangulo: ");
		rect.largura = scanner.nextDouble();
		rect.altura = scanner.nextDouble();

		System.out.printf("AREA: %.2f%n", rect.area());
		System.out.printf("Perimitro: %.2f%n", rect.perimiter());
		System.out.printf("Diagonal: %.2f%n", rect.diagonal());

		scanner.close();
	}

}

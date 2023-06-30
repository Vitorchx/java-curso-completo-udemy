package estruturaSequencial;

/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159*/

import java.util.Scanner;

public class Exe2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double a;
		double r = scanner.nextDouble();
		double pi = 3.14159;

		a = pi * r * r;
		System.out.printf("A=%.4f%n", a);
		
		scanner.close();

	}

}

package estruturaSequencial;

import java.util.Scanner;

/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
decimais.*/
public class Exe4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numFuncionario = scanner.nextInt();
		int horasTrabalhadas = scanner.nextInt();
		double valorHora = scanner.nextDouble();
		

		System.out.println("Numero Funcionário = " + numFuncionario);
		System.out.printf("Salario = %.2f%n ", horasTrabalhadas * valorHora);

	}

}

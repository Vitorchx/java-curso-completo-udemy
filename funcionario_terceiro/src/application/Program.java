package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();

		System.out.print("Entre com o numero de funcionarios: ");
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data");
			System.out.println("Outsourced(y/n)? ");
			char ch = scanner.next().charAt(0);
			System.out.print("Name: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			System.out.print("Hours: ");
			int hours = scanner.nextInt();
			System.out.println("Value per hour: ");
			double valuePerHours = scanner.nextDouble();

			if (ch == 'y') {
				System.out.println("Additional charge: ");
				double additionalCharge = scanner.nextDouble();

				list.add(new OutsourcedEmployee(name, hours, valuePerHours, additionalCharge));
			} else {

				list.add(new Employee(name, hours, valuePerHours));
			}

		}

		System.out.println();
		System.out.println("PAYMENTS: ");
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));

		}

		scanner.close();

	}

}

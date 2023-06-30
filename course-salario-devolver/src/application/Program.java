package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {
	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Entrer department's name: ");
		String departmentName = scanner.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = scanner.nextLine();
		System.out.print("Level: ");
		String workerLevel = scanner.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = scanner.nextDouble();
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,
				new Department(departmentName));

		System.out.print("quantos Contratos o trabalhador possui? ");
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter contract #" + i + " data: ");
			System.out.print("Date(DD/MM/YYYY): ");
			Date contractDate = sdf.parse(scanner.next());
			System.out.println("Value per hour: ");
			double valueperHour = scanner.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = scanner.nextInt();
			HourContract contract = new HourContract(contractDate, valueperHour, hours);
			worker.addContract(contract);

		}

		System.out.println();
		System.out.print("entre com mes e ano para calcular salario (MM/YYYY): ");
		String monthAndYear = scanner.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Namae: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for: " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

		scanner.close();
	}

}
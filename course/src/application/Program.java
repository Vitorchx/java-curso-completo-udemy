package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		product.name = scanner.nextLine();
		System.out.println("Price: ");
		product.price = scanner.nextDouble();
		System.out.println("Quantity in stock");
		product.quantity = scanner.nextInt();

	}

}

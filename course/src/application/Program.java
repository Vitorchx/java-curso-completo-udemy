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

		System.out.println();
		System.out.println("Product data: " + product);

		System.out.println();
		System.out.println("entre com o numero de produtos que sera adicionado em estoque: ");
		int quantity = scanner.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("Update data: " + product);

		System.out.println();
		System.out.println("entre com o numero de produtos que sera removido do estoque: ");
		quantity = scanner.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("Update data: " + product);

		scanner.close();
	}

}

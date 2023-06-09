package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		String name = scanner.nextLine();
		System.out.println("Price: ");
		double price = scanner.nextDouble();
	
		Product product = new Product(name, price);

		product.setName("Computer");
		System.out.println("Updated name: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Update price: " + product.getPrice());

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

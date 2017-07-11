package testpackage;

import java.util.Scanner;

public class TestClass {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter name: ");
		String temp = scan.nextLine();
		System.out.println("Hello World "+temp);
		for (int i = 5; i > 0; i--) {
			System.out.print(i);
		}
	}

}


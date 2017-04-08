package test;

import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
		int size;

		System.out.print("Enter the size of triangle(1~10): ");
		Scanner keyboard = new Scanner(System.in);
		size = keyboard.nextInt();

		while (size < 1 || size > 10) {
			System.out.print("Invalid size(1~10)...\nRe-enter the size: ");
			size = keyboard.nextInt();
		}
		for (int i = 0; i < (size-1); i++) {

			for (int j = size; j>i; j--){
				System.out.print("*");
			}

			System.out.println();
		}
		
		for (int i = 1; i <= size; i++) {

			for (int j = 0; j < i; j++){
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
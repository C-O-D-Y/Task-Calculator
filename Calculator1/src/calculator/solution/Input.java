package calculator.solution;

import java.util.Scanner;

import calculator.methods.solution.Methods;

public class Input {
	static Scanner scan = new Scanner(System.in);

	public Input() {
		System.out.println("1: Add 2:Substract 3:multiply 4:division");
		int k = scan.nextInt();
		System.out.println("Enter the no of Elements");
		int g = scan.nextInt();
		double h[] = new double[g];
		for (int i = 0; i < g; i++) {
			h[i] = scan.nextDouble();
		}
		Methods m = new Methods();
		switch (k) {
		case 1:
			m.add(h, g);
			break;

		case 2:
			m.substract(h, g);
			break;

		case 3:
			m.multiply(h, g);
			break;

		case 4:
			m.divide(h, g);
			break;

		default:
			System.out.println("Wrong Operation");
		}
	}

	public static void main(String args[]) {
		new Input();
	}
}

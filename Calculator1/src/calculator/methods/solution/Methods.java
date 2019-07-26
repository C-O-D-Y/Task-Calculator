package calculator.methods.solution;

public class Methods {
	double sum = 0;

	public void add(double[] h, int g) {
		sum = h[0];
		for (int i = 1; i < g; i++) {
			sum = sum + h[i];
		}
		System.out.println("Sum= " + sum);
	}

	public void substract(double[] h, int g) {
		sum = h[0];
		for (int i = 1; i < g; i++) {
			sum = sum - h[i];
		}
		System.out.println(sum);
	}

	public void multiply(double h[], int g) {
		sum = h[0];
		for (int i = 1; i < g; i++) {
			sum = sum * h[i];
		}
		System.out.println(sum);
	}

	public void divide(double h[], int g) {
		sum = h[0];
		for (int i = 1; i < g; i++) {
			sum = sum / h[i];
		}
		System.out.println(sum);
	}
}

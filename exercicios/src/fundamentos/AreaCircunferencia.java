package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {

		double raio = Double.parseDouble(System.console().readLine());
		final double PI = 3.14159;

		double area = PI * raio * raio;

		System.out.println("Área = " + area + " m2.");
	}

}

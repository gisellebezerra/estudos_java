package fundamentos;

import java.util.Scanner;

public class ExemploTry {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		try {
			int numeroInteiro = entrada.nextInt();
			System.out.println("Número Válido.");
			
			if (numeroInteiro > 10) {
				System.out.println("Número maior que 10");
			} else {
				System.out.println("Número menor que 10.");
				
			}
		} catch (Exception e) {

			System.out.println("Número Inválido!");
			
		} finally {
			entrada.close();
		}

	}

}

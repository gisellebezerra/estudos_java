package fundamentos;

import java.util.Scanner;

public class EquacaoSegundoGrau {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("-----Equação de Segundo Grau-----");
		System.out.println("Digite os valores");

		System.out.println("Digite o valor de a: ");
		int a = sc.nextInt();

		System.out.println("Digite o valor de b: ");
		int b = sc.nextInt();
		// Double a = 1.0;
		// Double b = 3.0;

		System.out.println("Digite o valor de c: ");
		int c = sc.nextInt();
		// Double c = -4.0;

		Double delta = Math.pow(b, 2) - 4 * a * c;
		System.out.println("\nO valor do delta será " + "" + delta + "\n");
		
		Double bhaskaraPositivo = (-b + Math.sqrt(delta)) / 2 * a;
		Double bhaskaraNegativo = (-b - Math.sqrt(delta)) / 2 * a;
		
		System.out.println("A equação de segundo grau possui a(s) seguinte(s) solução(ões)\n");
		String resultado = delta > 0
				? "A equação possui duas soluções reais" + " " +  bhaskaraPositivo + " e " + bhaskaraNegativo
				: "A equação não possui solução real.";
		resultado = delta == 0 ? " A equação possui uma solução real." + "" + bhaskaraPositivo : resultado;

		System.out.println(resultado);

		sc.close();

	}

}

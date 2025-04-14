//Crie um programa que leia um número inteiro n e calcule a soma dos números de 1 até n usando um laço for.

package ativ_for;

import java.util.Scanner;

public class Ativ2 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int n = entrada.nextInt();

		int soma = 0;

		for (int i = 1; i <= n; i++) {

			soma += i;
		}
		System.out.println("A soma de 1 até " + n + " é = " + soma);
		entrada.close();
	}
}

//Crie um programa que leia um número inteiro n e calcule o fatorial de n utilizando um laço for.

package ativ_for;

import java.util.Scanner;

public class Ativ3 {
	public static void main(String[] args) {

		   Scanner sc = new Scanner(System.in);
	        System.out.print("Digite um número: ");
	        int n = sc.nextInt();
	        int fatorial = 1;

	        for (int i = 1; i <= n; i++) {
	            fatorial *= i;
	        }

	        System.out.println("O fatorial de " + n + " é: " + fatorial);
	        sc.close();
	}

}



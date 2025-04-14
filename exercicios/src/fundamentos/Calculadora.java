package fundamentos;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o primeiro número");
		double numero1 = sc.nextDouble();
		
		System.out.println("Digite o segundo número");
		double numero2 = sc.nextDouble();
		
		System.out.println("Operações");
		System.out.println("+\n-\n *\n/\n %");		
		System.out.println("Digite a operação que deaeja realizar: ");
		
		String operacao = sc.next();
		
		double resultado = "+".equals(operacao) ? numero1 + numero2 : 0;
		resultado = "-".equals(operacao) ? numero1 - numero2 : resultado;
		resultado = "*".equals(operacao) ? numero1 * numero2 : resultado;
		resultado = "/".equals(operacao) ? numero1 / numero2 : resultado;
		resultado = "%".equals(operacao) ? numero1 % numero2 : resultado;
		
		System.out.println(numero1 + " " +  operacao + " "+  numero2 + " = " + resultado );
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package controle;

import java.util.Scanner;

public class WhileExemplo {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a condição para finalizar o sistema");
		String condicao = entrada.next();
		
		while(!condicao.equalsIgnoreCase("sair")) {
			
			System.out.println("Digite a condição para finalizar o sistema");
			condicao = entrada.next();
			
		}
		System.out.println("Sistema finalizado!");
		entrada.close();
	}

}

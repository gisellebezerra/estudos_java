package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {		
		
		System.out.println("\n ---------------------------------------------- Conversor de Temperatura ---------------------------------------------------- \n");
		
		while(true) {
			
			System.out.println("Escolha a temperatura que deseja conveter: Celsius -> Fahrenheit ou Fahrenheit -> Celsius.\n");
			System.out.println("Digite F para coverter de Celsius -> Fahrenheit.");
			System.out.println("Digite C para coverter de  Fahrenheit -> Celsius.\n");
			String escolha = System.console().readLine("Digite sua escolha -> ");
			
			final int AJUSTE = 32;
			final double FATOR = 5.0/9;		
			final double ATRIBUTO = 1.8;
			
			if(escolha.equalsIgnoreCase("C")) {		     	
				double graus = Double.parseDouble(System.console().readLine("\nDigite a temperatura em Fahrenheit para converter em Celsius: "));
				double resultado = (graus - AJUSTE) * FATOR;
				System.out.println("A temperatura em graus Celsius é: " + String.format("%.2f",resultado) + "°C");				
				break;				
			}
			else if (escolha.equalsIgnoreCase("F")) {
				double graus = Double.parseDouble(System.console().readLine("\nDigite a temperatura em Celsius para converter em Fahrenheit: "));
				double resultado = (graus * ATRIBUTO) + AJUSTE;
				System.out.println("\nA temperatura em graus Celsius é: " + String.format("%.2f",resultado)  + "°F");
				break;
				
				
			}else {
				System.out.println("\n ****ERRO****");
				System.out.println("\nDigite uma opção válida.\n");
				System.out.println("------------------------------------------------------------------------------------------------------------\n");
								
			}
		}
	}
}


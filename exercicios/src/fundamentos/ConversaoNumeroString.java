package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		
		//Conversão Número -> String
		
		//Médoto toString
		//length: disponível para String
		
		Integer num1 = 1000;
		
		System.out.println(num1.toString());
		System.out.println(num1.toString().length());
		
		//Utilizando diretamento o Interger.toString
		
		int num2 = 1000;
		System.out.println(Integer.toString(num2));

	}
	
}

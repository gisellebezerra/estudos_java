package fundamentos;

public class OperadoresUnarios {
	public static void main(String[] args) {
		
		int a = 5;
        int b = ++a * 2; // Pré-incremento

        int x = 5;
        int y = x++ * 2; // Pós-incremento

        System.out.println("Com pré-incremento (++a): ");
        System.out.println("a = " + a); // 6
        System.out.println("b = " + b); // 6 * 2 = 12

        System.out.println("\nCom pós-incremento (a++): ");
        System.out.println("x = " + x); // 6
        System.out.println("y = " + y); // 5 * 2 = 10
	}                         

}

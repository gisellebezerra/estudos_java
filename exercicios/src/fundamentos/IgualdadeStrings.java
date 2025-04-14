package fundamentos;

import java.util.Scanner;

public class IgualdadeStrings {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String s1 = "5";
		String s2 = sc.nextLine();
		
		System.out.println(s2.trim().equals(s1));
		
		
	}

}

package abc;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
        System.out.println("Hello World");
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Number");
        int i=sc.nextInt();
        System.out.println(" You entered" +i);
        
        System.out.println("Hello " +args[0]);
        System.out.println("Hello " +args[1]);
        
	}
	
	
}
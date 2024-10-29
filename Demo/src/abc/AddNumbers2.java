package abc;

import java.util.Scanner;

public class AddNumbers2 {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<10; i++);{
		System.out.println("Enter number");
		int n=sc.nextInt();
		if ((n%5==0)||(n%3==0)||(n%11==0)) {
			sum = sum+n;
		}
		}
		System.out.println("sum:"+sum);
		sc.close();
		

	}
}



package abc;

import java.util.Scanner;

public class AddNumbers {

	public static void main(String[] args) 
	{
	       System.out.println("Add Numbers");
           Scanner sc= new Scanner (System.in);
           int sum=0;
           for (int i=0;i<10;i++)
          {
           System.out.println("Enter number");
           int n=sc.nextInt();
           sum=sum+n;
          }
           System.out.println("Addition: " +sum);
           sc.close();
    
	}

}

package abc;


import java.util.Scanner;

public class AddNames {
	public static void main(String[] args) {
		
		System.out.println("Addnames");
		Scanner sc=new Scanner(System.in);
		
		String[] names= new String[5];
		
		for(int i=0; i<5;i++)
		{
			System.out.println("enter the names");
			names [i]=sc.next();

			
			
		}
	
		System.out.println("names are:");
		for(String name:names)
				{
					System.out.println(name + " ");
				}
		sc.close();
	}
}
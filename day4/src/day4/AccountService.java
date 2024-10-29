package day4;

import java.util.Scanner;

public class AccountService {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		
	final int Max_Account=10;
	Account[] account= new Account [Max_Account];
	int AccountCount=0;
		
	while(true) {
		System.out.println("\nMenu :");
	    System.out.println("1. Add Account");
	    System.out.println("2. Delete Account");
	    System.out.println("3. Display Account");	
	    System.out.println("4. Exit")	;
	    System.out.println	("Select an option (1-4): ");
	    
	    int choice =sc.nextInt();
	    sc.nextLine();
	 
	    switch (choice) {
        case 1:
           
            if (AccountCount < Max_Account) {
                System.out.print("Enter Account Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Initial Balance: ");
                double balance = sc.nextDouble();
                sc.nextLine(); 
                System.out.print("Enter Account Type: ");
                String type =sc.nextLine();
                account[AccountCount] = new Account(name, balance, type);
                AccountCount++;
                System.out.println("Account added successfully!");
            } else {
                System.out.println("Account limit reached. Cannot add more accounts.");
            }
            break;

        case 2:
         
            System.out.print("Enter Account ID to delete: ");
            String acidToDelete = sc.nextLine();
            boolean found = false;
            for (int i = 0; i < AccountCount; i++) {
                if (account[i].getAcid().equals(acidToDelete)) {
                   
                    for (int j = i; j < AccountCount - 1; j++) {
                        account[j] = account[j + 1];
                    }
                    account[AccountCount - 1] = null; 
                    AccountCount--;
                    found = true;
                    System.out.println("Account deleted successfully!");
                    break;
                }
            }
            if (!found) {
                System.out.println("Account not found.");
            }
            break;

        case 3:
           
            if (AccountCount == 0) {
                System.out.println("No accounts available.");
            } else {
                for (int i = 0; i < AccountCount; i++) {
                    System.out.println(account[i]);
                    System.out.println("-------------------");
                }
            }
            break;

        case 4:
            System.out.println("Exiting the program.");
            sc.close();
            return;

        default:
            System.out.println("Invalid choice, please try again.");
    }
	}}
}


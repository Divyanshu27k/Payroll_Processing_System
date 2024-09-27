package com.pnb;

import java.util.Scanner;

public class BankApplication {
	
	static int deposit(Scanner sc) {
        int amt;
        System.out.println("Enter the amount to deposit");
        amt = sc.nextInt();
        System.out.println("Amount deposited");
        return amt;
    }
	 static int withdraw(Scanner sc) {
	        int amt;
	        System.out.println("Enter the amount to be withdrawn");
	        amt = sc.nextInt();
	        System.out.println("Amount has been withdrawn");
	        return amt;
	    }
	 static int manager(Scanner sc) {
	        System.out.println("You have entered the wrong PIN 3 Times Contact the Manager");
	        int newpin;
	        System.out.println("Welcome to manager cabin \n Enter the new PIN");
	        newpin = sc.nextInt();
	        return newpin;
	    }
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int pass = 1010;
	        int bal = 100000, count = 1;

	        while (true) {
	            System.out.println("Enter the pin");
	            int pin = sc.nextInt();

	            if (pin == pass) {
	                while (true) {
	                    int choice, amt;
	                    System.out.println(
	                            "1. Deposit\n 2. Withdraw \n 3. Balance \n 4. Exit \n ____________________ \n Enter your choice");
	                    choice = sc.nextInt();
	                    switch (choice) {

	                    case 1:
	                        amt = deposit(sc);
	                        bal += amt;
	                        break;

	                    case 2:
	                        amt = withdraw(sc);
	                        bal -= amt;
	                        break;

	                    case 3:
	                        System.out.println("Available Balance is: " + bal);
	                        break;

	                    case 4:
	                        System.out.println("Thank you for using this"
	                                + " App!!!");
	                        return;

	                    default:
	                        System.out.println("Invalid Choice!!! \n Try Again..");
	                        break;
	                    }
	                }
	            } else {
	                System.out.println("Wrong pin...");
	                if (count == 3) {
	                    pass = manager(sc);
	                    count = -1;
	                }
	                count++;
	            }
	        }
	    }

}

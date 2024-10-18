package main;

import java.util.Scanner;

public class Main {
	
	public void displayMenu() {
		System.out.println("Calculator");
		System.out.println("Please Choose calculator Mode (1-1):");
		System.out.println("1. Standard");
//		System.out.println("2. Trigonometry");
		System.out.print(">> ");
	}
	
	public void standardCalcMenu(Scanner scan) {
		int choice = -1;
		
		int result = 0;
		
		do {
			int temp = 0;
			
			System.out.println();
			System.out.println("Standard Calculator");
			System.out.println("Please choose an operation (1-4):");
			System.out.println("1. Addition (+)");
			System.out.println("2. Substraction (-)");
			System.out.println("3. Multiplication (x)");
			System.out.println("4. Division (:)");
			System.out.println("Select 0 to return to main menu.");
			System.out.print(">> ");
			
			if (scan.hasNextInt()) {
                choice = scan.nextInt();
            } else {
                System.out.println("Error: Please enter an integer."); 
                scan.next();  
                continue;  
            }
			
			if (choice == 0) {
				System.out.println();
				return;
			}
			
			switch (choice) {
			case 1:
				System.out.print("Input number for addition: ");
					
				while (!scan.hasNextInt()) {
					System.out.println("Error: please enter an integer.");
					System.out.println();
					System.out.print("Input number for addition: ");
					scan.next();
				}
				temp = scan.nextInt();
				System.out.print(result + " + " + temp + " = ");
				result += temp;
				System.out.println(result);
				break;
			
			case 2:
				System.out.print("Input number for substraction: ");
				
				while (!scan.hasNextInt()) {
					System.out.println("Error: please enter an integer.");
					System.out.println();
					System.out.print("Input number for substraction: ");
				}
				temp = scan.nextInt();
				System.out.print(result + " - " + temp + " = ");
				result -= temp;
				System.out.println(result);
				break;
				
			case 3:
				System.out.print("Input number for multiplication: ");
				
				while (!scan.hasNextInt()) {
					System.out.println("Error: please enter an integer.");
					System.out.println();
					System.out.print("Input number for multiplication: ");
				}
				temp = scan.nextInt();
				System.out.print(result + " * " + temp + " = ");
				result *= temp;
				System.out.println(result);
				break;
				
			case 4:
				System.out.print("Input number for division: ");
				
				while (!scan.hasNextInt()) {
					System.out.println("Error: please enter an integer.");
					System.out.println();
					System.out.print("Input number for division: ");
				}
				temp = scan.nextInt();
				System.out.print(result + " / " + temp + " = ");
				result /= temp;
				System.out.println(result);
				break;
				
			default:
				System.out.println("Invalid choice, please try again.");
			}
		} while (choice != 0);
	}
	
	public void trigonoCalcMenu(Scanner scan) {
		int choice = -1;
		
		int result = 0;
		
		do {
			int temp = 0;
			
			System.out.println();
			System.out.println("Trigonometry Calculator");
			System.out.println("Please choose an operation (1-4):");
			System.out.println("1. Addition (+)");
			System.out.println("2. Substraction (-)");
			System.out.println("3. Multiplication (x)");
			System.out.println("4. Division (:)");
			System.out.println("Select 0 to return to main menu.");
			System.out.print(">> ");
			
			if (scan.hasNextInt()) {
                choice = scan.nextInt();
            } else {
                System.out.println("Error: Please enter an integer."); 
                scan.next();  
                continue;  
            }
			
			if (choice == 0) {
				System.out.println();
				return;
			}
			
			switch (choice) {
			case 1:
				System.out.print("Input number for addition: ");
					
				while (!scan.hasNextInt()) {
					System.out.println("Error: please enter an integer.");
					System.out.println();
					System.out.print("Input number for addition: ");
					scan.next();
				}
				temp = scan.nextInt();
				System.out.print(result + " + " + temp + " = ");
				result += temp;
				System.out.println(result);
				break;
			
			case 2:
				System.out.print("Input number for substraction: ");
				
				while (!scan.hasNextInt()) {
					System.out.println("Error: please enter an integer.");
					System.out.println();
					System.out.print("Input number for substraction: ");
				}
				temp = scan.nextInt();
				System.out.print(result + " - " + temp + " = ");
				result -= temp;
				System.out.println(result);
				break;
				
			case 3:
				System.out.print("Input number for multiplication: ");
				
				while (!scan.hasNextInt()) {
					System.out.println("Error: please enter an integer.");
					System.out.println();
					System.out.print("Input number for multiplication: ");
				}
				temp = scan.nextInt();
				System.out.print(result + " * " + temp + " = ");
				result *= temp;
				System.out.println(result);
				break;
				
			case 4:
				System.out.print("Input number for division: ");
				
				while (!scan.hasNextInt()) {
					System.out.println("Error: please enter an integer.");
					System.out.println();
					System.out.print("Input number for division: ");
				}
				temp = scan.nextInt();
				System.out.print(result + " / " + temp + " = ");
				result /= temp;
				System.out.println(result);
				break;
				
			default:
				System.out.println("Invalid choice, please try again.");
			}
		} while (choice != 0);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int choice = -1;
		
		Main menu = new Main();
		
		do {
			menu.displayMenu();
			
			if (scan.hasNextInt()) {
                choice = scan.nextInt();
            } else {
                System.out.println("Error: Please enter an integer."); 
                System.out.println();
                scan.next();  
                continue;  
            }
			
			scan.nextLine();
			
			switch (choice) {
			case 1:
				menu.standardCalcMenu(scan);
				break;

			default:
				System.out.println("Invalid choice, please try again.");
				System.out.println();
			}
			
		} while (choice != 2);
		
		scan.close();
	}

}

package bankapp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserOptions {

    static void menu(){
        
        Scanner options = new Scanner(System.in);
        double balance = 0.0;
        boolean isRunning = true;

        String username = UserLogin.loginInfo();
    
        // will run these choices until isrunning is false (exit)
        
        while (isRunning) {
       
        System.out.printf("Hello %s, welcome to the Bank of Hadi!\n", username);
        System.out.println("");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Transaction Log");
        System.out.println("5. Exit");
        //blank
        System.out.println("");
        
        
    try{
        System.out.print("Enter your choice (1 - 4): ");
        int choice = options.nextInt();
        System.out.println("");
        
        

        switch(choice){
            case 1: 
                System.out.println("----------------------------------");
                UserOptions.showBalance(balance);
                System.out.println("----------------------------------");
                System.out.println("");
                break;
            case 2:
                System.out.println("----------------------------------");
                System.out.println("Your new Balance is: " + (balance += UserTransactions.deposit()));
                System.out.println("----------------------------------");
                System.out.println("");
                break;
            case 3:
                System.out.println("----------------------------------");
                System.out.println("Your new Balance is: " + (balance -= UserTransactions.withdraw()));
                System.out.println("----------------------------------");
                System.out.println("");
                break;
            case 4:
                System.out.println("----------------------------------");
                UserTransactions.transactionLog();
                System.out.println("----------------------------------");
                System.out.println("");
                break;
            case 5:
                isRunning = false;
                System.out.println("----------------------------------");
                System.out.println("See you next time!");
                System.out.println("----------------------------------");
                break;
            default:
                System.out.println("Invalid choice");
                break;
                
                }
            
            } catch(InputMismatchException e){
                System.out.println("------------------------------------------------");
                System.out.println("That is an Invalid Entry, Please type 1 - 4.");
                System.out.println("------------------------------------------------");
                options.nextLine();
            }

    
        }

    }


    static void showBalance(double balance){

        System.out.printf("Your balance is: $%.2f\n", balance);
    }


}

package bankapp;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;


public class UserTransactions {
    
   static Scanner transactions = new Scanner(System.in);

   static ArrayList<String> log = new ArrayList<>();

    static double deposit(){

    try{
        System.out.print("Enter an amount to be deposited: ");
        System.out.print("");
        double depositAmount = transactions.nextDouble();

        // exception incase user picks a negitive amount

        if(depositAmount < 0){
            System.out.println("Negative amounts are not accpeted please try again.");
            return 0.0;
        }

        log.add(String.format("Deposited: $%.2f", depositAmount));


        return depositAmount;

    }  catch (InputMismatchException e){
        System.out.println("------------------------------------------------");
        System.out.println("Please only enter numerical values, Thank you.");
        System.out.println("------------------------------------------------");
        transactions.nextLine();
        return 0.0;
    }
}


    static double withdraw(){

    try {
        System.out.print("Enter an amount to be withdrawn: ");
        System.out.print("");
        double withdrawAmount = transactions.nextDouble();


        if (withdrawAmount < 0){
            System.out.println("Negative amounts are not accepted please try again.");
            return 0.0;
        }

        log.add(String.format("Withdrew: $%.2f", withdrawAmount));

        return withdrawAmount;

    } catch (InputMismatchException e){
        System.out.println("------------------------------------------------");
        System.out.println("Please only enter numerical values, Thank you.");
        System.out.println("------------------------------------------------");
        transactions.nextLine();
        return 0.0;

        }
    }

    static void transactionLog(){
    
        System.out.println("Your transaction log: ");

         if (log.isEmpty()) {
        System.out.println("No transactions yet.");
    } else {
        for (String entry : log) {  
            System.out.println(entry);
        }
    }

    }

}


package bankapp;

import java.util.Scanner;

public class UserLogin {
    static String loginInfo(){
    Scanner credentials = new Scanner(System.in);

    System.out.print("Username: ");
        String username = credentials.nextLine();
        System.out.println("");

    System.out.print("Password: ");
        String password = credentials.nextLine();
        System.out.println(" ");

     return username;

    }

    
}

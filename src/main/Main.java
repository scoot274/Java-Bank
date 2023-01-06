package src.main;

import java.util.InputMismatchException;
import java.util.Scanner;
import src.lib.Account;
import src.lib.Manager;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Manager manager = new Manager();

    while (true) {
      System.out.println("\nWelcome to The Bank");
      System.out.println("Select one of the actions from the list:");

      System.out.println("1. Create Account");
      System.out.println("2. View Account");
      System.out.println("3. Withdraw from Account");
      System.out.println("4. Deposit from Account");
      System.out.print("> ");

      Account bill = manager.newAccount("Bill", 1254);
      bill.GetAccountDetails();

      int action = scanner.nextInt();
      scanner.nextLine();

      try {
        switch (action) {
          case 1:
            // TODO start creation of accounts
            // ask for pin
            // make sure pin is no more than 8 numbers and no less than 4
            // ask for name
            // create account and return new account to console
            // after prototype, outsource to a different function/class
            break;
          case 2:
            break;
          case 3:
            break;
          case 4:
            break;
          default:
            System.out.println("Invalid input.");
        }
      } catch (InputMismatchException err) {
        System.out.println("Invalid input.");
      }
    }
  }
}
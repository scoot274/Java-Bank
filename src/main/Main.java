package src.main;

import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("\nWelcome to The Bank");
      System.out.println("Select one of the actions from the list:");

      System.out.println("1. Create Account");
      System.out.println("2. View Account");
      System.out.println("3. Withdraw from Account");
      System.out.println("4. Deposit from Account");
      System.out.print("> ");

      int action = scanner.nextInt();
      scanner.nextLine();

      try {
        switch (action) {
          case 1:
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
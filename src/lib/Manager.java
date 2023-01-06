// manages transactions and general account handling throughout the program

package src.lib;

import java.util.ArrayList;

public class Manager {
  ArrayList<Account> Accounts;

  public Manager() {
    Accounts = new ArrayList<Account>();
  }

  public Account newAccount(String name, int pin) {
    Account newAccount = new Account(name, pin);
    Accounts.add(newAccount);

    return newAccount;

  }

  public static Account getAccount(int pin) {
    return new Account("Bill", pin); // Add functionality
  }
}
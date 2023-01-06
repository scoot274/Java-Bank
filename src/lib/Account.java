// This is an incredibly unsafe approach but I am only using this for a lab in apcs

package src.lib;

enum TransactionType {
  WITHDRAW,
  DEPOSIT
}

public class Account {
  public String AccountName;
  public int pin;
  private double Balance;

  public Account(String n, int p) {
    this.AccountName = n;
    this.Balance = 0.00;
    this.pin = p;

  }

  public void GetAccountDetails() {
    // Maybe find a cleaner way of doing this TBD
    System.out.println("Here is " + this.AccountName + "\'s account");
    System.out.println("");
    System.out.println("Name: " + this.AccountName);
    System.out.println("Balance: $" + this.Balance);
  }

  public void AccountTransactions(TransactionType transactionType, double amount) {
    if (transactionType == TransactionType.WITHDRAW) {
      if (this.Balance - amount < 0) {
        System.out.println("You do not have enough money in your account to withdraw $" + amount);
      } else {
        this.Balance -= amount;

        System.out.println("Your new balance is $" + this.Balance);
      }
    }
    // TODO Create deposit function
  }
}
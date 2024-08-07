public class Account {
private double balance;

public Account() {
  this.balance = 0.0d;
}

public double getBalance() {
  return this.balance;
}

public void setBalance(double balance) {
  this.balance = balance;
}

public void credit(double amount) {
  this.balance += amount;
}

// public BusinessException InsufficientBalance() {
//   return new BusinessException(ErrorCode.INSUFF_BAL);
// }

public void debt(double amount) throws InsufficientBalanceException { // 
  if (this.balance < amount) 
    // throw new BusinessException(-99, "Withdrawal amount > Account Balance"); // checked exception
    // throw new BusinessException(ErrorCode.INSUFF_BAL);
    throw new InsufficientBalanceException(); // only can throw Object, not method
    // throw new IllegalArgumentException();
  this.balance -= amount;
}


  public static void main(String[] args) {
    Account account = new Account();
    account.credit(100);
    try {
      account.debt(70);
      account.debt(31); // error
    } catch (BusinessException e) {
      // System.out.println("Message" + e.getErrorCode() + "-" + e.getMessage());
      System.out.println(e.codeWithMessage()); // Error: -99 - Withdrawal amount > Account Balance
    } finally { // proper use after throw which cannot getBalance at the end and need to run for extra line. 
      System.out.println("This is a section to run no matter there is exception or not");
    }
    System.out.println(account.getBalance()); // 30
    
  }
  
}

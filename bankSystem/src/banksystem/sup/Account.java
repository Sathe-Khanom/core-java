package banksystem.sup;

public class Account {

    int accountNumber;
    double balance;

    public Account() {
    }

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println( amount + "   deposited successfully " );
        } else {
            System.out.println("Invalid deposit amount");
        }

    }

    public void withdraw(double amount) {

if(amount > 0 && balance >= amount){

balance -= amount;
    System.out.println(amount + "withdrawn successfully");
        
}

else{
    System.out.println("Insufficient balance");
}

    }

    public void accountDetails() {

        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance : " + balance);
    }

}

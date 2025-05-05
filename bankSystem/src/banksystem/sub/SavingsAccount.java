
package banksystem.sub;


public class SavingsAccount extends banksystem.sup.Account {
    
  double interestRate;

    public SavingsAccount() {
    }

    public SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return (double) interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingsAccount(double interestRate, int accountNumber, double balance) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    
    
   
   public void deposit(){

   super.deposit();
    

}
   @Override
   public void accountDetails(){
super.accountDetails();
       System.out.println("Interest Rate : " + interestRate);
 
}
    
}

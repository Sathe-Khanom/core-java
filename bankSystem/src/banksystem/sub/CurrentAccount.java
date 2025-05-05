
package banksystem.sub;


public class CurrentAccount extends banksystem.sup.Account{
    
    double overDraftLimit;

    public CurrentAccount() {
    }

    public CurrentAccount(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }
    

    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    public CurrentAccount(double overDraftLimit, int accountNumber, double balance) {
        super(accountNumber, balance);
        this.overDraftLimit = overDraftLimit;
    }
    
    
    @Override
    public void withdraw(double amount){
   double balance = getBalance();
   
   if(amount > 0 && balance >= amount){

balance -= amount;
    System.out.println(amount + "withdrawn successfully");
        
}

else{
    System.out.println("Insufficient balance");
}
    
    
}
    @Override
    public void accountDetails(){

 super.accountDetails();
        System.out.println("Overdraft Limit : " + overDraftLimit);
}
    
}

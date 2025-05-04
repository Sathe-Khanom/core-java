
package banksystem.sub;


public class SavingsAccount extends banksystem.sup.Account {
    
   float interestRate;

    public SavingsAccount() {
    }

    public SavingsAccount(float interestRate) {
        this.interestRate = interestRate;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }
   
   @Override
   public void deposit(){

   super.deposit();
    

}
   @Override
   public void accountDetails(){
super.accountDetails();
       System.out.println("Interest Rate : " + interestRate);
 
}
    
}

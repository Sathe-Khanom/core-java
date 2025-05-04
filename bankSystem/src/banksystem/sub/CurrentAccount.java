
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
    
    @Override
    public void withdraw(){

    super.withdraw();
        System.out.println("Withdraw : " + overDraftLimit);
    
}
    @Override
    public void accountDetails(){

 super.accountDetails();
        System.out.println("Withdraw : " + overDraftLimit);
        System.out.println("Current Balance : " + (super.getBalance() - overDraftLimit) );
}
    
}


package calculate.loan;

import java.util.Scanner;


public class CalculateLoan {

   
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        
        System.out.println("Enter Annual Interest Rate");
        double annualInterestRate = t.nextDouble();
        
        double monthlyInterestRate = annualInterestRate/1200;
        
        
        System.out.println("Enter Number of Years");
        int numbersOfYears = t.nextInt();
        
        
        System.out.println("Enter Loan Amount");
        double loanAmount = t.nextDouble();
        
        double monthlyPayment = loanAmount * monthlyInterestRate/(1-1/ Math.pow(1 + monthlyInterestRate,numberOfYears * 12));
        
        double   
    }
    
}

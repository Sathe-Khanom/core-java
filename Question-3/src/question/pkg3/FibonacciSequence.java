
package question.pkg3;


public class FibonacciSequence {
    
    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        //System.out.println(fibonacci(n - 1) + fibonacci(n - 2));
        return fibonacci(n - 1) + fibonacci(n - 2);
    } 
    
    
    
    
}

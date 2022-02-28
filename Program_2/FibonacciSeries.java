import java.util.*;
 
public class Main {
 
    
    public static void main(String[] args) {
        
        int first = 0;
        int second = 1;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("How many numbers you want to print in a Fibonacci series");
        int n = in.nextInt();
        
        System.out.println("Fibonacci series :");
        System.out.print(first + " "+ second + " ");
        
        int next;
 
        for(int i = 2; i < n; i++) {
            next = first + second;
            
            System.out.print(next + " ");
            
            first = second;
            second = next;
        }
        
    }
    
}

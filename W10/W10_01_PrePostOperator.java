package W10;

public class W10_01_PrePostOperator {
    public static void main(String[] args) 
    {
        int a = 5;
        int b = 5+ a--; 

        System.out.println("a = " + a); 
        System.out.println("b = " + b);        
        
        int c = 5;
        int d = c++; 
        
        System.out.println("c = " + c); 
        System.out.println("d = " + d); 
        
    } 
}
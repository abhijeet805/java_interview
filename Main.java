import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
      
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter x:");
    int x=sc.nextInt();
    System.out.println("Enter y:");
    int y=sc.nextInt();
    
    x = x + y; 
    y = x - y; 
    x = x - y; 
    
    System.out.println("X="+x);
    System.out.println("Y="+y);
    
  }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int a[]={45,78,96,12,65,100};
      
      int max=a[0];
      
      for(int i=0;i<a.length;i++){
          if(a[i]>max)
            {
              max=a[i];
            }
      }
      
      System.out.println("Max Element="+max);
  }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int a[]={45,78,96,12,65,100};
      int n=a.length;
      
      for(int pass=1;pass<n;pass++){
        for(int i=0;i<n-pass;i++){
          
          if(a[i]>a[i+1]){
            int t=a[i];
            a[i]=a[i+1];
            a[i+1]=t;
          }
          
        }
      }
      
      System.out.println("Array in Asending order=");
      for(int i=0;i<n;i++)
       System.out.println(a[i]);
       
       
       
      for(int pass=1;pass<n;pass++){
        for(int i=0;i<n-pass;i++){
          
          if(a[i]<a[i+1]){
            int t=a[i];
            a[i]=a[i+1];
            a[i+1]=t;
          }
          
        }
      }
      
      System.out.println("Array in Decending order=");
      for(int i=0;i<n;i++)
       System.out.println(a[i]);
  }
}
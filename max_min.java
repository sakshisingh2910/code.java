package arrays;
import java.util.*;
public class max_min {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println(" enter size: ");
      int n  = sc.nextInt();
      int a[] = new int[n];
       
      System.out.println("enter values: ");
      for (int i = 0; i< a.length; i++)
        a[i] =sc.nextInt();
     int max  =a[0];
     int min = a[0];

     for (int i = 1;i<a.length;i++){
        if(a[i]<min)
             min = a[i];
        if (a[i]> max)
             max = a[i];
     }
     System.out.println(" max = " + max);
     System.out.println("min = " + min);

    }
}

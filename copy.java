package arrays;
 import java.util.*;
public class copy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("enter values");
        
        for(int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        int b[] = Arrays.copyOf(a,n);
        System.out.println("\n element in b[] after duplicating are ");
        for( int i=0; i<n; i++){
            System.out.println("element at b["+ i +"] =" +b[i]);
        }
    }
}

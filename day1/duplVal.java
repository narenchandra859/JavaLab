import java.util.*;
public class duplVal {
    public static void main(String args[]) {
        System.out.println("Enter number of elements in array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int h[] = new int[9999];
        boolean b[] = new boolean[9999];
        System.out.println("Enter array: ");
        for(int i = 0; i<n; i++) {
            a[i]=sc.nextInt();
            h[a[i]]=h[a[i]]+1;
            b[a[i]]=true;
        }
        System.out.println("Value\tFrequency");
        for(int i = 0; i<n; i++) {
            if(b[a[i]]) {
                System.out.println(a[i] + "\t" + h[a[i]]);
                b[a[i]]=false;
            }
        }
    }
}

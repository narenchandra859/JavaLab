import java.util.*;
public class moveZero {
    public static void main(String args[]) {
        System.out.println("Enter number of elements in array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int zeroCount=0, pos=0;
        System.out.println("Enter array: ");
        for(int i = 0; i<n; i++) {
            a[i]=sc.nextInt();
            if(a[i]!=0)
                b[pos++]=a[i];
            else
                zeroCount++;
        }
        for(int i = 0; i<zeroCount; i++)
            b[pos++]=0;
        System.out.println("Final array: ");
        for(int i = 0; i<n; i++)
            System.out.print(b[i]+" ");
    }
}

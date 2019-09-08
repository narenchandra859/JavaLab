import java.util.*;

public class stringBufferfn {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        StringBuffer s = new StringBuffer(sc.nextLine());
        System.out.println("Appending ' wow' to string: "+s.append(" wow"));  
        System.out.println("Inserting 'hello!' at index 0: " +s.insert(0,"hello"));//demonstrates trim()
        System.out.println("Replacing index(0-2) with '555': "+s.replace(0,3,"555")); 
        System.out.println("Reversing the string: "+s.reverse());
        System.out.println("Showing substring from index 1-4: "+s.substring(1,4));
    }
}

import java.util.*;

public class stringFunctions{
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("String length is: "+s.length());  
        System.out.println("Trimming whitespaces = "+s.trim());//demonstrates trim()
        System.out.println("Replacing 'a' with '5'"+s.replace('a','5')); 
        System.out.println("Does string have hello? "+s.contains("hello"));
        System.out.println("Enter another string: ");
        String s1 = sc.nextLine();
        System.out.println("Does original string equal new string? "+s.equals(s1));
    }
}
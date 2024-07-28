import java.util.Scanner;

public class stringbasic {
    public static void main(String[] args) {
        //how to input the string
        // Scanner sc=new Scanner(System.in);
        // String name;
        // name=sc.nextLine();
        // System.out.println("your name is "+name);
        String firstName="IV";
        String lastName="III";
        // String fullName=firstName+ " "+ lastName;
        // System.out.println(fullName);
    
        int i=0;
        while (i<firstName.length()) {
           System.out.println(firstName.charAt(i));
            i++;
        }
    }
}

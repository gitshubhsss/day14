import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        String newString="";
        //now we wants to check the string is palindrome or not
        int i=str.length()-1;
        while (i>=0) {
            newString=newString+str.charAt(i);
            i--;
        }

        if(newString.equals(str)){
            System.out.println("isPalindrom");
        }else{
            System.out.println("is not palindrome");
        }
    }
}

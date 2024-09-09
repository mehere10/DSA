package StringDataStructure.PractiseQuestion;
import java.util.Scanner;

public class palindrone {

    static void isPalindrome(String str)
    {
        // abcdcba
        int i=0,j=str.length()-1;

        boolean flag=true; // we created a checkpoint , it means by default a string is considered palindrome.
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                flag=false; // if characters does not match the flag will be set to false.
                break;
            }
            i++;
            j--;
        }
        if(flag) System.out.println("The string is palindrome");
        else System.out.println("The String is not Palindrome");

    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);  // taking input
        System.out.println("Enter a string : ");
        String str=sc.nextLine();
        isPalindrome(str);

    }
}

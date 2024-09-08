package StringDataStructure.PractiseQuestion;

import java.util.Scanner;

public class caseConversion     // better approach
{
    static String caseConvert()
    {
        Scanner sc=new Scanner(System.in);

        // taking a user input
        StringBuilder str=new StringBuilder(sc.nextLine());
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);	// will get the current character.

            boolean flag=true;	// it means we consider the character to be capital by default
            int ascii=(int)ch;	// this will typecast the char to its ascii value.
            if(ascii>=97)	// small
            {
                ascii-=32;
                char temp=(char)ascii;
                str.setCharAt(i,temp);
            }
            else	// capital
            {
                ascii+=32;
                char temp=(char)ascii;
                str.setCharAt(i,temp);
            }
        }
        return str.toString();
    }
    public static void main(String[] args) {

        String result=caseConvert();
        System.out.println(result);
    }
}

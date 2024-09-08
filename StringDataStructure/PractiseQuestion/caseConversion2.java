package StringDataStructure.PractiseQuestion;

public class caseConversion2    // not a great method to implement
{
    public static String caseConvert(String str)
    {

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);	// will get the current character.

            boolean flag=true;	// it means we consider the character to be capital by default
            int ascii=(int)ch;	// this will typecast the char to its ascii value.
            if(ascii>=97)	// small
            {
                ascii-=32;
                char temp=(char)ascii;
                str=str.substring(0,i)+temp+str.substring(i+1);
            }
            else	// capital
            {
                ascii+=32;
                char temp=(char)ascii;
                str=str.substring(0,i)+temp+str.substring(i+1);
            }
        }
        return str;
    }
    public static void main(String[] args) {

        String str="NiShaNT";

        System.out.println("Original string : "+str);
        String result=caseConvert(str);
        System.out.println("After case conversion : ".concat(result));
    }
}

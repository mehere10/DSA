package StringDataStructure.PractiseQuestion;

public class checkForVowelsAndConsonants
{
    static String myMethod(String str)
    {
        String result="";
        for(int i=0;i<str.length(); i++)
        {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i'
                    || str.charAt(i)=='o' || str.charAt(i)=='u' )
            {
                result=result+"v";
            }
            else
            {
                result=result+"c";
            }
        }
        return result;  // return result
    }
    public static void main(String[] args) {

        String str="hello";     // expected o/p   cvccv

        System.out.println(myMethod(str));


    }
}

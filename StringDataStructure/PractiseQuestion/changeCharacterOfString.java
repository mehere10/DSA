package StringDataStructure.PractiseQuestion;


// Program to change a character of the String
public class changeCharacterOfString
{
    static String changeStringChar(String str,int index,char ch)
    {
        String result="";
        result=str.substring(0,index)+ch+ str.substring(++index);
        return result;
    }
    public static void main(String[] args) {

        // We have to change it to Heylo.
        String originalString="Nishant";

        // Function call
        String output=changeStringChar(originalString,0,'P');

        System.out.println("Original String : "+originalString);
        System.out.println("New String : "+output);
    }
}

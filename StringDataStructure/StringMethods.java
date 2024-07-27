package StringDataStructure;

public class StringMethods
{
    public static void main(String[] args)
    {
        String fname="Tony";
        String lName="Stark";

        String fullName=fname.concat(" "+lName);        // full name

        System.out.println(fullName.length());      // printing the  length of a string.

        // charAt method
        for(int i=0;i<fullName.length();i++)
        {
            System.out.print(fullName.charAt(i)+"");
        }

    }
}

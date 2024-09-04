package StringDataStructure.PractiseQuestion;

public class QuestionTwo
{
    public static void main(String[] args)
    {
        String s="abcd";

        // Program to print all substrings from the above string.
        for(int i=0;i<=s.length();i++)
        {
            for(int j=i+1;j<=s.length();j++)
            {
                System.out.print(s.substring(i,j)+" ");
            }
        }

    }
}

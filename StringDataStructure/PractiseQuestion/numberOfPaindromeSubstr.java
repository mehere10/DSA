package StringDataStructure.PractiseQuestion;

public class numberOfPaindromeSubstr {
    static boolean isPalindrome(String s){
        int i=0,j=s.length()-1;

        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {

        String str="Nishant";
        int count=0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){

                // this condition work when a substring is palindrome.
                 if(isPalindrome(str.substring(i,j))==true) {
                     System.out.print(str.substring(i, j) + " ");
                     count++;   // count will only increase if a substring is palindrome
                 }
            }
        }
        System.out.println("\nNumber of palindrome substrings : "+count);
    }
}

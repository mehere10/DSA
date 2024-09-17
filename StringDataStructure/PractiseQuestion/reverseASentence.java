package StringDataStructure.PractiseQuestion;

public class reverseASentence {
    static String reverse(String str){

        // create an empty answer string ,it will store the final result
        String ans="";

        // create an empty stringBuilder String
        StringBuilder sb=new StringBuilder("");

        // traversing through original string
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);      // current character
            if(ch!=' '){
                sb.append(ch);
            }
            else{
                sb.reverse();
                ans+=sb;
                ans+=" ";
                sb=new StringBuilder(" ");    // deleting the entire string builder
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str="I am an online teacher";
        String result=reverse(str);

        System.out.println(result);
    }
}

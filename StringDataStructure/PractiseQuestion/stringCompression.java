package StringDataStructure.PractiseQuestion;

public class stringCompression {

    static String strCompression(String str){
        StringBuilder ans=new StringBuilder(""+str.charAt(0));
        int count=1;
        for(int i=1;i<str.length();i++){
            char curr=str.charAt(i);
            char prev=str.charAt(i-1);

            if(curr==prev){
                count++;
            }
            else{
                if(count>1)ans.append(count);   // if the count is one it will not display the integer 1
                count=1;
                ans.append(curr);
            }
        }
        if(count>1)ans.append(count);
        return ans.toString();
    }
    public static void main(String[] args) {

        String str="aabbbbbcdde";
        String result=strCompression(str);

        System.out.println(result);
    }
}

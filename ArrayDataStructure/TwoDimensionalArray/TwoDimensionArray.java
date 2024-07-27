package ArrayDataStructure.TwoDimensionalArray;// creating a 2d array in java.
import java.util.Arrays;
public class TwoDimensionArray
{
    public static void main(String[] args)
    {
        // step1-declare
        int[][] myArr;

        // step2-instantiate
        myArr=new int[2][2];

        // step3-initialize
        myArr[0][0]=1;
        myArr[0][1]=2;
        myArr[1][0]=3;
        myArr[1][1]=4;

        System.out.println(Arrays.deepToString(myArr)); // method to print array

        // all three steps together.

        String[][] String2DArray={{"a","b"},{"c","d"}};     // string type of array.
        System.out.println(Arrays.deepToString(String2DArray)); // method to print array
    }


}

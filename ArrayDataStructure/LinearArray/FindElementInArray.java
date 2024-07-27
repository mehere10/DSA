package ArrayDataStructure.LinearArray;
import java.util.Scanner;

public class FindElementInArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);      // create obj of scanner

        System.out.print("Enter the size of array :");        // taking the size of array as input
        int size =sc.nextInt();     // storing it in a size variable

        int[] myArr=new int[size];  // initializing the array


        // input the array.
        System.out.print("Enter the elements of the array here :");
        for(int i=0;i<size;i++)
        {
            myArr[i]=sc.nextInt();
        }

        // output the array
        System.out.print("The elements of the array are : ");
        for(int x:myArr)
        {
            System.out.print(x+" ");
        }


        // search the element in the array.
        System.out.println("\nEnter the number you want to search in the array :");
        int findNumber=sc.nextInt();        // taking input from user which number to search in the array.



        // creating a boolean variable to state that element is found or not
        boolean found=false;        // keeping it false initially coz we haven't found the element yet.


        // traversing the array to find the element.
        for(int i=0;i<size;i++)
        {
            if(myArr[i]==findNumber)        // comparing the number to each array index.
            {
                found=true;     // if we find the number on any index , the found variable will be updated
                System.out.println("The element is found on the index : "+i);   // printing the index of the number.
                break;
            }
        }

        if(!found)
        {
            System.out.println("The element was not found .");
        }



    }




}



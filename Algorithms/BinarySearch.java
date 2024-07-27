//package Algorithms;
//
//public class BinarySearch
//{
//    private static int iterativeBinarySearch(int[] numbers,int numberToFind)
//    {
//        // creating two pointers
//        int low=0;      // starting pointer
//        int high=numbers.length-1;      // ending pointer
//
//
//
//        // logic-> we just need to keep moving the pointers so that ultimately they come closer and closer and find the element.
//        while(low<=high)
//        {
//            int middlePosition=(low+high)/2;        // middle index
//            int middleNumber=numbers[middlePosition];      // middle number
//
//            if(numberToFind==middleNumber)
//            {
//                return middlePosition;
//            }
//
//            else if(numberToFind<middleNumber)
//            {
//                high=middlePosition-1;
//            }
//
//            else if(numberToFind>middleNumber)
//            {
//                low=middlePosition+1;
//            }
//
//        }
//
//        return -1;      // to indicate we didn't find the number
//    }
//
//    static int recursiveBinarySearch()
//    {
//
//    }
//
//
//    public static void main(String[] args)
//    {
//
//        int[] arr={1,3,5,7,9,11,13,15,17};
//        int target=17;
//
//
//        BinarySearch b=new BinarySearch();
//        int result=b.iterativeBinarySearch(arr,target);
//
//        if(result!=-1)
//        {
//            System.out.println("The element is found at index:"+result);
//        }
//        else{
//            System.out.println("Sorry cant find the element.");
//        }
//    }
//
//}

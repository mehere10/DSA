//public class ArrayList
//{
//
//
//    static java.util.ArrayList<Integer> Leaders(java.util.ArrayList<Integer> arr, int n)   // {16,17,4,3,5,2}  {17,4,5,2}
//    {
//        for(int i=0;i<arr.size()-1;i++)
//        {
//            int j=0;
//            int current= arr.get(i);
//            int currentToNext=arr.get(i+1);
//
//            if(current>currentToNext)
//            {
//                arr.add(j,currentToNext);
//                j++;
//            }
//        }
//
////        for(int i=0;i<arr.size()-1;i++)
////        {
////            int k=0;
////            if(arr[i]>arr[i+1])
////            {
////                arr[k]=arr[i];
////                k++;
////            }
////        }
//
//        return arr;
//    }
//
//    public static void main(String[] args)
//    {
//
//        int[] nums={16,17,4,3,5,2};
//        java.util.ArrayList<Integer> a= new java.util.ArrayList<>();
//
//        System.out.println("Original array :");
//        for(int x:nums)
//        {
//            System.out.print(x+" ");
//        }
//
//
//        int[] result=Leaders(nums,6);
//
//
//        System.out.print("The leaders are :");
//        for(int x:result)
//        {
//            System.out.println(x+" ");
//        }
//
//    }
//}

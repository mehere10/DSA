package Algorithms;

public class BubbleSort
{

    static class Test
    {
        static int[] bubbleSort(int[] arr)
        {
            for(int i=0;i<arr.length-1;i++)
            {
                for(int j=0;j<arr.length-i-1;j++)
                {
                    if(arr[j]>arr[j+1])
                    {
                        // swap
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }

                }
            }

            return arr;
        }
    }


    public static void main(String[] args)
    {
        Test t=new Test();

        int[] arr={7,8,3,1,2};
        System.out.print("Before sorting :");
        for(int x:arr)
        {
            System.out.print(x+" ");
        }

        // after
        int[] result=t.bubbleSort(arr);

        System.out.print("\nAfter sorting :");
        for(int x:result)
        {
            System.out.print(x+" ");
        }

    }
}

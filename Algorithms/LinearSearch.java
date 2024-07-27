package Algorithms;

public class LinearSearch {
    static int findElement(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // arguments.
        int[] arr = {1, 3, 5, 7, 9};
        int target = 7;


        // function call
        int result = findElement(arr, target);

        if (result == -1) {
            System.out.println("Couldnt find the element.");
        } else {
            System.out.println("The element is found at index :" + result);
        }
    }
}



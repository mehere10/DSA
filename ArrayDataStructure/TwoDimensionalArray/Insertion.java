package ArrayDataStructure.TwoDimensionalArray;

class InsertionTest {
    int[][] arr = null;     // initializing array 

    // constructor.
    public InsertionTest(int numberOfRows, int numberOfColumns) {
        arr = new int[numberOfRows][numberOfColumns];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    // inserting value in the array.
    public void insertValueInTheArray(int row, int col, int value) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = value;

                System.out.println("Successfully inserted.");
            } else {
                System.out.println("This cell is already occupied.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for the 2D array.");
        }
    }
}

public class Insertion
{
    public static void main(String[] args)
    {
        InsertionTest i=new InsertionTest(3,3);
        i.insertValueInTheArray(1,1,10);
    }
}

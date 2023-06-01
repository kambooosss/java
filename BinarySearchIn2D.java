import java.util.Arrays;

public class BinarySearchIn2D {
    public static void main(String[] args) {
        int [][] matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };

        System.out.println(Arrays.toString(binSearch(matrix,10)));
    }
    static int [] binSearch(int[][] arr , int target)
    {
        int row =0;
        int colum = arr[0].length -1;
        while(row < arr.length && colum >= 0 )
        {
            if(arr[row][colum] == target)
                return new int[] {row, colum};
            if(arr[row][colum] > target)
            {
                colum--;
            }
            else    
                row++;
        }
        return new int[] {-1,-1};
    }
}

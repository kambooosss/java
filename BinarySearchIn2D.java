import java.util.Arrays;

public class BinarySearchIn2D {
    //u can still optimise it think , if not refer kunal notes in github 

    public static void main(String[] args) {
        int [][] matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };

       
        System.out.println(Arrays.toString(binSearch(matrix,10)));


        System.out.println(Arrays.toString(optimisedBS(matrix,10)));
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



    static int[] optimisedBS(int [][] arr, int target)
    {

        //here we are finding the ceil of the target in the last colum so that the we can find
        // in which row the elemt may be present


        int start = 0;
        int end = arr.length-1,mid;
        int col=arr[0].length-1; // colum is fixex i.e last colum
        while(start < end)
        {
            mid = start + (end - start)/2;
            if(arr[mid][col] == target)
            {
                return new int[] {mid,col};
            }
            if(arr[mid][col] > target)
            {
                end = mid;
            }
            else    
                start = mid+1;
        }
        // now start contain the row number which contain the target

        int row = start;
        start = 0;
        end = arr[0].length-1;
        while(start < end)
        {
            mid = start + (end - start)/2;
            if(arr[row][mid] == target)
            {
                return new int[] {row,mid};
            }
            if(arr[row][mid] > target)
            {
                end = mid-1;
            }
            else    
                start = mid+1;
        }

        return new int[] {-1,-1};
    }
}

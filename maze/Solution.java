package maze;
import java.util.* ;



import java.io.*; 
public class Solution {
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    public  ArrayList<ArrayList<Integer>> ratInAMaze(int[][] maze, int n) {
        // Write your code here.
        int[][] ref = new int[n][n];
        helper(maze,n,0,0,ref);
        
        return ans;

        

    }
    public void helper(int[][] maze, int n,int row,int col,int[][] reference)
    {
        if(row == n-1 && col == n-1)
        {
            reference[row][col]=1;
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    temp.add(reference[i][j]);
                }

            }
            ans.add(temp);
            reference = new int[n][n];
            // System.out.println(ans.toString());
        }
        if(row >= n || col >= n || row < 0 || col < 0 || maze[row][col] == 0  )
            return;
        reference[row][col]=1;
        maze[row][col]=0;
        helper(maze,n,row+1,col,reference);
        
        helper(maze, n, row, col+1,reference);
        
        helper(maze, n, row-1, col,reference);
         
        helper(maze, n, row, col-1,reference);
        maze[row][col]=1;



    }

}
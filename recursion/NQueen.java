package recursion;

import java.util.Scanner;

import javafx.scene.layout.Background;

public class NQueen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[][] board = new boolean[n][n]; 
        nqueen(board,0);
    }

    static void nqueen(boolean[][] board,int row)
    {
        if(row == board.length)
        {
            display(board);
            System.out.println();
            return ;
        }

        //check row by row
        for(int col=0;col< board.length;col++)
        {
            
            if(check(board,row,col))
            {
                board[row][col]=true;
                nqueen(board, row+1);
                board[row][col]=false;

            }
            
        }
    }
    static boolean check(boolean [][]board,int row,int col)
    {
        //checking above colum
        for(int i=0;i< row;i++ )
        {
            if(board[i][col]==true)
            {
                return false;
            }
        }
        //checking right diagonal
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++)
        {
            if(board[i][j] == true)
            {
                return false;
            }
        }
        //chekcing left digonal
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--)
        {
            if(board[i][j] == true)
            {
                return false;
            }
        }
        return true;
    }
    static void display(boolean[][] board)
    {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                if(board[i][j])
                    System.out.print("Q"+" ");
                else    
                    System.out.print("X"+" ");
            }
            System.out.println();
        }
    }
}

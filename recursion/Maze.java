package recursion;

public class Maze {
    public static void main(String[] args) {
        maze(3,3,"");
    }
    static void maze(int row,int colum,String p )
    {
        if(row == 1 && colum == 1)
        {
            System.out.println(p);
            return;
        }
        if(row > 1)
        {
            maze(row-1,colum,p+"D");
        }
        if(colum > 1)
        {
            maze(row,colum-1,p+"R");
        }
    }
}

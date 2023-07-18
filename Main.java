
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n=sc.nextInt();
        
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        if(check(arr))
            System.out.println("ture");
        else    
            System.out.println("false");
    }
    static boolean check(int[] arr)
    {
        int flag=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>arr[i+1])
            {
                flag=1;
            }
        }
        if(flag == 0)
        {
            return false;
        }
        
        List<Integer> temp = new ArrayList<>();
        for(int i:arr)
        {
            
            if(i > arr.length)
                return false;
            if(temp.contains(i))
                return false;
            else    
                temp.add(i);
            
        }
        if(!temp.contains(arr.length))
            return false;
        return true;
        
    }
}
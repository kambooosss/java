package problems;

import java.util.Scanner;

public class SumTriangle {
    //https://www.geeksforgeeks.org/sum-triangle-from-array/
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        createArray(arr);
    
    }
    static void createArray(int[] arr)
    {
        if(arr.length == 1)
        {
            
            return;
        }
        int n = arr.length-1;
        int [] newarr = new int[n];
        for(int i=0;i<arr.length-1;i++)
        {
            newarr[i]=arr[i]+arr[i+1];
            System.out.print(newarr[i] + " ");
        }
        System.out.println();
        createArray(newarr);
    }
}

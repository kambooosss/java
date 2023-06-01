package problems;

import java.util.Scanner;

public class MinMax {
    //https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        findMax(arr,0,arr[0]);
        findMin(arr,0,arr[0]);
        
    }
    static void findMax(int[] arr,int start,int max)
    {
        if(start == arr.length)
        {
           
            System.out.println("max "+ max);
            return;
        }
        if(arr[start] > max)
        {
            findMax(arr, start+1,arr[start]);
        }
        else
            findMax(arr, start+1,max);
        
    }
    static void findMin(int[] arr,int start,int min)
    {
        if(start == arr.length)
        {
           
            System.out.println("min "+ min);
            return;
        }
        if(arr[start] < min)
        {
            findMin(arr, start+1,arr[start]);
        }
        else
            findMin(arr, start+1,min);
        
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        StringBuilder sb = new StringBuilder("1");
        System.out.println(sb.toString());
		for(int i=0;i<n;i++)
		{
            StringBuilder temp = new StringBuilder();
            for(int j=0;j<sb.length();)
            {
                int k=count(sb.toString(),j);
                temp.append(k);
                temp.append(sb.charAt(j));
                j=j+k;


            }
            System.out.println(temp.toString());
            sb=temp;
		}
    }
    static int count(String str,int i)
    {
        int count=1;
        while(i < str.length()-1 && str.charAt(i)==(str.charAt(i+1)))
        {
            count++;
            i++;
        }
        return count;
    }
}

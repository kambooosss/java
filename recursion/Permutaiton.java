package recursion;

public class Permutaiton {
    public static void main(String[] args) {
        arrange("","abc");
    }

    static void arrange(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        for(int i=0;i <= p.length();i++) // <= (less than or equal to ) note this .
        {
            arrange(p.substring(0, i)+up.charAt(0)+p.substring(i, p.length()), up.substring(1));
        }
    }
    
}

package recursion;

public class RemoveA {
    public static void main(String[] args) {
        skip("","abbacdea");
    }

    static void skip(String p, String up) // p-processed , up - unprocesssed
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        if(up.charAt(0) == 'a')
        {
            skip(p,up.substring(1));
        }
        else    
            skip(p+up.charAt(0),up.substring(1));
    }
}

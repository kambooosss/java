package recursion;

public class SkipString {
    public static void main(String[] args) {
        System.out.println(skipapple("abcdefappleghijklmapple"));

    }
    static String skipapple(String str)
    {
        if(str.isEmpty())
        {
            return "";
        }
        if(str.startsWith("apple"))
        {
            return skipapple(str.substring(5));
        }
        else    
            return str.charAt(0) + skipapple(str.substring(1));
    }
}

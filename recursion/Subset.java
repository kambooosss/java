package recursion;

import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
        subset("","abc");
        System.out.println(subsetWithReturn("","abc")); 
    }
    static void subset(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        subset(p+up.charAt(0),up.substring(1));
        subset(p,up.substring(1));
    }

    static ArrayList<String> subsetWithReturn(String p,String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> take = subsetWithReturn(p+up.charAt(0),up.substring(1)) ;
        ArrayList<String> ignore = subsetWithReturn(p, up.substring(1));

        take.addAll(ignore);

        return take;

    }
}

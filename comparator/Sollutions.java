package comparator;

import java.util.* ;
import java.io.*; 
public class Sollutions {
    public  void sortByFrequency(int[] nums) {
        // Write your code here
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums)
        {
            arr.add(i);
            if(map.containsKey(i))
                map.put(i,map.get(i)+1);
            else    
                map.put(i,1);
        }
        
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i,Integer j)
            {
                if(map.get(j) > map.get(i))
                    return 1;
                else
                {

                    
                    if(arr.indexOf(j) < arr.indexOf(i))
                        return 1;
                    else
                        return 0;
                }
            }
        };

        Collections.sort(arr,com);
        // Collections.sort(arr,(i,j)->
        // {
        //     int a = map.get(j);
        //     int b = map.get(i);
        //         if(a > b)
        //             return 1;
        //         else
        //             return -1;
        // });
        System.out.println(arr.toString());
        // int[] primitive = arr.stream()
        //                       .mapToInt(Integer::intValue)
        //                       .toArray();
       
    }
}
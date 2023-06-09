/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class BalanceParenthesis {
	public static void main (String[] args) {
		//code
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(valid("",str));
    }

    
    static boolean valid(String p,String str)
    {

        if(p.length() == 0 && str.length()==0)
        {
            return true;
        }
        else if(str.length() == 0) return false;
        
        switch(str.charAt(0))
        {
            case '(':
                return valid(p+"(",str.substring(1));
                
            case '[':
                return valid(p+"[",str.substring(1));
                
            case '{':
                return valid(p+"{",str.substring(1));
                
            case ')':
                if(p.charAt(p.length()-1) == '(')
                    return valid(p.substring(0, p.length()-1), str.substring(1));
                else
                    return false;
                
            case ']':
                if(p.charAt(p.length()-1) == '[')
                    return valid(p.substring(0, p.length()-1), str.substring(1));
                else
                    return false;
            
            case '}':
                if(p.charAt(p.length()-1) == '{')
                    return valid(p.substring(0, p.length()-1), str.substring(1));
                else
                    return false;
                

        }
        return false;
    }
}

        
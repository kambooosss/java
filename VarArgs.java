import java.util.Arrays;

public class VarArgs {
    //variable argumetents
    public static void main(String[] args) {
        fun(1,2,3,4,5);
        multiple(1,2,"kamaelsh","loghes");
    }
    static void fun(int ...v) // can give variable number of arguments
    {
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a, int b , String ...str)//always varargs should be the last parameter.
    {
        System.out.println(Arrays.toString(str));
    }
}

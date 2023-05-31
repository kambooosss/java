import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        //IN JAVA THERE IS NO PASS BY REFERENCE ONLY PASS BY VALUE IS POSSIBLE
        String str = "kamalesh";//kamalesh is a object // str is a reference variable
        changeName(str); // copy of referece variable is passed
        System.out.println(str);

        //no change in actual str


        int[] arr = {1,2,3,4,5};
        chaneNum(arr); // pass by copy of value of reference 
        System.out.println(Arrays.toString(arr)); 

        int a=10;
        // BLOCK
        {
            a=99; // INSIDE THE BLOCK A CAN BE MODIFIED BUT CANT BE INIITALISEED AGIAN 
            //i.e int a = 99; is not posible
            int b = 120;
        }
        // OUT SIDE THE BLOCK "b" CANT BE USED

        


         
    }
    static void changeName(String name) // name points to the same object kamalesh but, 
    {
        name = "logesh"; // here new object is created "loghes" and name forced to point to logeshl.
    }
    static void chaneNum(int [] num)// num points to arr
    {
        // num = {9,8,7,6,5}; this line gives error 
        num[0] = 99; // this line change the actuall array becoz here we are not creating new object
        // we are modifieing
        
    }
}

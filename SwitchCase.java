import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        // switch(day)
        // {
        //     case 1, 2,3,4,5 -> System.out.println("Weekday");
        //     case 6,7 -> System.out.println("weedend");
        // }

        //THIS KIND OF SWITCH CASE IS AVAILABLE ONLY IN JAVA 14

        //WHICH CAN BE IMPLEMENTED BY 

        switch(day)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            System.out.println("weeddays");;
            break;
            case 6:
            case 7:
            System.out.println("weekday");
            break;
        }
        //IN SWITCH CASE NESTING ALSO POSSIBLE 
            

    }
}

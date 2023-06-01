public class shadowing {
    static int x = 99;
    public static void main(String[] args) {
        System.out.println("the value of x in upper scope " + x);
        int x = 12;
        System.out.println("value of x in lower scope " + x);
        

    }
}

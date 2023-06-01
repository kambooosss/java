public class string {
    public static void main(String[] args) {
        String str = "kamalesh";
        String str2 = "kamalesh"; // both points to same object

        System.out.println(str == str2);

        System.out.println(str.equals(str2));

        String a = new String("kam");
        String b = new String("kam"); // each have different oject of same value
        System.out.println(a == b); // so that this give false

        System.out.println(a.equals(b));

    }
}

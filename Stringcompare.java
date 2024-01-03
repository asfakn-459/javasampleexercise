public class Stringcompare {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s4 = new String ("Hello");
        String s3 = new String ("hello");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s4));
        System.out.println(s3.equalsIgnoreCase(s4));

    }
}

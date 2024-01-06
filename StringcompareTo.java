public class StringcompareTo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s4 = new String("Welcome");
        String s3 = new String("hello");
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s4.compareTo(s1));
    }
}

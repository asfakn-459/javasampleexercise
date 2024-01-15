public class SubString {
    public static void main(String[] args) {
        String s1 = "  Welcome to java Program";
        String s2 = s1.trim();
        System.out.println(s2);
        System.out.println(s2.substring(11));
        System.out.println(s2.substring(11,15));
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s1.charAt(11));
        System.out.println(s1.length());
        String s3 = s2.replace("java","Python");
        System.out.println(s3);
    }
}

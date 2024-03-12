import java.util.*;

public class Vector1 {
    public static void main(String[] args) {
        Vector <String> v = new Vector<String>();
        System.out.println(v.size());
        v.add("123");
        v.add("Raja");
        System.err.println(v.capacity());
        v.add("Arul");
        v.add("Asfaq");
        v.add("Jeeva");
        v.add("Paramesh");
        v.add("Naveen");
        v.add("Mani");
        v.add("Muhilan");
        v.add("Mohan");
        v.add("Kavin");
        v.add("Surya");
        System.out.println(v.size());
        System.err.println(v.capacity());
        for(String s:v){
            System.out.println(s +"");
        }
    }
}

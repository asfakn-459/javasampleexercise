import java.util.*;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList <String> ll = new LinkedList<String>();
        ll.add("Lafira");
        ll.add("Suhaib");
        ll.add("Niyamathulla");
        ll.add("Asfaq");
        Iterator<String> itr = ll.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        for(String s:ll){
            System.out.println(s);
        }

    }
}

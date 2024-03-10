import java.util.ArrayList;
import java.util.Iterator;
public class Array_list {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        System.out.println("The Default length of Arraylist is "+name.size());
        name.add("Syed");
        name.add("Suhaib");
        name.add("asfak");
        name.add("Ilyas");
        name.add(3,"Arul");
        System.out.println("After adding the data length of arraylist is "+name.size());
        Iterator itr = name.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());

        }

    }
}

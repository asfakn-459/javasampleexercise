import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<String> s= new Stack<String>();
        s.push("Asfaq");
        s.push("Lafira");
        s.push("Niyamatullah");
        s.push("Suhaib");
        s.push("Vignesh");
        System.out.println("the size is " + s.size());
        System.out.println("the top value "+s.peek());
        System.out.println("The capacity is " +s.capacity());
        for (String s1: s){
            System.out.println(s1);

        }
        s.pop();
        System.out.println("After the pop");
        for (String s1: s){
            System.out.println(s1);

        }
    }

}

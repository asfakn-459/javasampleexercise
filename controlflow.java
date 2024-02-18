import java.util.Scanner;
public class controlflow {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
        try {
            for (; ; ) {
            System.out.println("Enter your to age to check vote eligibilty ");
            int age = s.nextInt();
            if (age >= 18)
                System.out.println("You are eligible to vote");
            else
                System.out.println("you need to wait for " + (18 - age) + "year()s to vote");
        }
    }catch(Exception e)
    {System.out.println("You have exicted + e");}

    }
}

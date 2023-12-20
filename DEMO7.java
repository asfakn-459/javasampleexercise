package asfaak;
import java.util.Scanner;

public class DEMO7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = in .nextInt();
		for (int i = 1; i <= 10; i++)
		{
			System.out.println(i + "*" + n + " = " + (n * i));
		}
		

	}

}

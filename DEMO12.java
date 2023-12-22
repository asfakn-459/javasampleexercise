package asfaak;
import java.util.Scanner;

public class DEMO12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1 = in.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = in.nextInt();
		System.out.print("Enter the third number: ");
		int num3 = in.nextInt();
		System.out.print("Enter the fourth number:");
		int num4 = in.nextInt();
		System.out.print("Enter th efifth number:");
		int num5 = in.nextInt();
		System.out.print("Average of five number is : " +(num1 + num2 + num3 + num4 + num5)/3);
	}

}

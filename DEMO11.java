package asfaak;
import java.util.Scanner;

public class DEMO11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner io = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double radius = io.nextDouble();
		System.out.println("Perimeter is = " + (2 * radius * Math.PI));
		System.out.println("Area is = " + (Math.PI * radius * radius));
	}

}

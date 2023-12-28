package asfaak;

import java .util.Scanner;

public class DEMO15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input the first number: ");
		x = in.nextInt();
		System.out.print("Input the second number: ");
		y = in.nextInt();
		
		z = x;
		x = y;
		y = z;
		
		System.out.println("Swapped values are:" + x + " and " + y);
		
				

	}

}

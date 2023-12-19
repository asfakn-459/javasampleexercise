package asfaak;
import java.util.Scanner;


public class DEMO6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("First numbe: ");
		int n1 = scanner.nextInt();
		System.out.print("Second number: ");
		int n2 = scanner.nextInt();
		int sum = n1 + n2;
		int minus = n1 - n2;
		int multiply = n1 * n2;
		int subtract = n1 + n2;
		int divide = n1 / n2;
		int rnums = n1 % n2;
		System.out.printf("Sum = %d\nMinus = %d\nMultiply = %d\nSubtract = %d\nDivide = %d\nRemainderof2Numbers = %d\n ",sum,minus,multiply,subtract,divide,rnums);
		
		
		

	}

}

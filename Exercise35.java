import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Exercise35 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input the number of sides on the polygon: ");
        int ns = input.nextInt();
        System.out.println("Input the length of one of the sides: ");
        double side = input.nextDouble();
        System.out.println("The area is : " + polygonArea(ns, side )+"\n");


    }
    public static double polygonArea(int ns, double side){
        return  (ns * (side * side)) / (4.0 * Math.tan((Math.PI / ns)));

    }
}

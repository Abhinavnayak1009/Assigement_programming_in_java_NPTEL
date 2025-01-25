package assigement_nptel_java;

import java.util.Scanner;

public class assigement_week1_2 {

	public static void main (String [] args) {
		Scanner sc =  new Scanner (System.in);
		System.out.println("please enter the value of radius");
		//int radius  = sc.nextInt();
		double radius = sc.nextDouble();
		System.out.println("please enter the value of heigth");
		//int heigth =  sc.nextInt();
     double heigth = sc.nextDouble();
     System.out.print("volume of cylinder is : ");
     double volume = Math.PI*radius *radius*heigth;
     System.out.print(volume);
	}
}

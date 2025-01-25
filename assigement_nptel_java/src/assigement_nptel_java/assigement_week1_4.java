package assigement_nptel_java;
import java.util.Scanner;

public class assigement_week1_4 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in)) {
			System.out.println("please enter the divident");
			int x = sc.nextInt();
			System.out.println("please enter the value of diviser");
			int y = sc.nextInt();
			System.out.println("The Quoteint is "+ x/y );
			System.out.println("The Remainder is "+ x%y);
		}

	}

}

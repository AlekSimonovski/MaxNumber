import java.util.Scanner;
public class MaxNumber {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Largest number from N loaded numbers: ");
			int n, x, max;
			System.out.println("Enter the amount of numbers you want to check: ");
			n = input.nextInt();
			System.out.println("Enter 1. number: ");
			x = input.nextInt();
			max = x;
			int i;
			for (i=2; i<=n; i++) {
				System.out.println("Enter "+ i +". number: ");
				x = input.nextInt();
				if (x>max) 
				max = x;
			}
			i=i-1;
			System.out.println("The max number out of the "+ i +" entered numbers is: " +max);
			
		}
}

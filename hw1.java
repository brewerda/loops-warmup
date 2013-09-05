import java.util.Scanner;


public class hw1 {
	public static void main(String[] args) {
		// 3(3);
		5();

	}
	public void 3(int x) {
		int sum = 1;
		for (x=x;x > Math.pow(10^-12) ; x++ ) {
			sum = sum + x;

		}
	}
	public void 5() {
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a positive integer: ");
		number = reader.nextInt();
		while (number > 1) {
			if (number%2 == 0 ) {
				number = number/2;
				System.out.println(number);

			} else {
				number = 3*number + 1;
				System.out.println(number);
			}
		}
	}
}
public class september {
	public static void main(String[] args) {
		// zero();
		one(2, 5);
	}
	public static void zero() {
		int sum = 0;
		int n = 5;
		for (int i=1;i <= n ; i++ ) {
			sum = sum + i;
		}
		System.out.println(sum);

	}
	public static void one(int x, int n) {
		int sum = x;
		while (n > 1) {
			sum = sum * x;
			n--;
		}
		System.out.println(sum);


	}
	public static void two() {

	}
}
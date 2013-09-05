public class september {
	public static void main(String[] args) {
		zero(5);
		// one(2, 5);
		// two(7);
	}
	public static void zero(int n) {
		int sum = 0;
		// int n = 5;
		for (int i=1;i <= n ; i++ ) {
			sum += i;
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
	public static void two(int x) {
		int sum = 1;
		for (x=x;x > 0 ;x-- ) {
			sum *= x;
		}
		System.out.println(sum);

		
	}
}
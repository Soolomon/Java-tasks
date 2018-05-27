
public class T14 {
	public static void main(String[] args) {
		variant();
	}

	public static void variant() {
		int sum = 200;
		int[] coins = { 1, 2, 5, 10, 20, 50, 100, 200 };
		int[] ways = new int[sum + 1];
		ways[0] = 1;

		for (int i = 0; i < coins.length; i++) {
			for (int j = coins[i]; j <= sum; j++) {
				ways[j] += ways[j - coins[i]];
			}
		}
		// can be generate
		System.out.println(ways[ways.length - 1]);
	}
}

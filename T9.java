package T9;

import java.util.Random;

public class T9 {
	public static void main(String[] args) {
		System.out.println(randomNumberBetwen0to1(5));
	}

	public static int randomNumberBetwen0to1(int n) {
		Random random = new Random();
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (random.nextBoolean())
				count++;
		}
		return count;
	}
}
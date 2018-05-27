package T9;

/*Find the number of steps for which you get 1, using the following process: we take any
the natural number n is greater than one. If it is even, then divide it by 2, and if it is odd, then
multiply by 3 and add 1*/
public class T10 {
	public static void main(String[] args) {
		System.out.println(stepWhenIGet1(10));
	}

	// 10 5 16 8 4 2 1
	public static int stepWhenIGet1(int some_number) {
		int count = 0;
		if (some_number <= 0) {
			return 0;
		}
		while (some_number != 1) {
			if (some_number % 2 == 0) {
				some_number /= 2;

			} else {
				some_number = some_number * 3 + 1;
			}
			count++;
		
		}
		return count + 1;
	}
}

public class T12 {
	public static void main(String[] args) {
		System.out.println(sumNaturalNumber(1000));
	}

	public static int sumNaturalNumber(int natural_number) {
		int sum = 0;
		for (int i = 1; i < natural_number; i++) {
			if (i % 3 == 0 || i % 5 == 0)
				sum+=i;
		}
		return sum;
	}
}
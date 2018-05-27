
public class T13 {
	public static void main(String[] args) {
		System.out.println(dev1to20());
		
	}

	public static int dev1to20() {
		int number = 0;
		for (int i = 1; i < 999999999; i++) {
			if (i % 20 == 0 && i % 19 == 0 && i % 18 == 0 && i % 17 == 0 && i % 16 == 0 && i % 15 == 0 && i % 14 == 0
					&& i % 13 == 0 && i % 12 == 0 && i % 11 == 0) {
				number = i;
				break;
			}
		}
		return number;
	}
}

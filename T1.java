package T1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumbersOfFibonachi {
	public static void showNumbersFibonachi(int quantity) {
		int a = 1;
		int b = 1;
		int d = 0;
		for (int i = 0; i < quantity; i++) {
			System.out.println(a);
			d = a + b;
			a = b;
			b = d;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader enter = new BufferedReader(new InputStreamReader(System.in));
		showNumbersFibonachi(Integer.parseInt(enter.readLine()));

	}
}

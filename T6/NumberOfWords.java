package T6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberOfWords {
	public static void calculationWords(String text)
	{
		int blockCount = text.split(" +").length;
		System.out.println(blockCount);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader enter = new BufferedReader(new InputStreamReader(System.in));
		calculationWords(enter.readLine());

}
}

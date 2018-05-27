package T7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
	public static int factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
			fact=fact*i;
		return fact;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader enter = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(factorial(Integer.parseInt(enter.readLine())));

}
}

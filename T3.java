package T3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExchangeWall {
	public static void exchangeToHryvnja(float kurs,int quantity)
	{
		float sum;
		sum=quantity/kurs;
		System.out.println(sum);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader enter = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter kurs usd:");
		float kurse=Float.parseFloat(enter.readLine());
		System.out.println("Enter quantity uah:");
		int uah=Integer.parseInt(enter.readLine());
		exchangeToHryvnja(kurse,uah);
}
	
}
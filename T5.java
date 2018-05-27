package T5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrom {
	public static boolean isPalindrome(String s)
	{
		int j=s.length();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==s.charAt(j-1))
			j--;
			else
				return false;
		}
		return true;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader enter = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(isPalindrome(enter.readLine()));

}
	
}

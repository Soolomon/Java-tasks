package T4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoudLetters {
	public static int loudLetters(String s)
	{
		int count=0;
		String loudletters="aeyuio";
		for(int j=0;j<loudletters.length();j++) 
		{
		for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)==loudletters.charAt(j))
					count++;
				
			}
		}
		return count;
		
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader enter = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(loudLetters(enter.readLine()));

}

}

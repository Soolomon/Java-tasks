package T2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecomposeToMultiplier {
	public static void decomposeToMultiplier(float multiplier)
	{	
		float sum;
		int i=2;
			while (i<=multiplier)
			{
				sum=multiplier/i;
				if(sum%1 == 0) //int else float
				{
					System.out.println(i);
					multiplier=sum;
				}
				else 
					i++;
					
					
					
				
			}
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader enter = new BufferedReader(new InputStreamReader(System.in));
		decomposeToMultiplier(Integer.parseInt(enter.readLine()));
		

	}
}

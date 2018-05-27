
public class T8 {
	private static int[] digits;

	public static void main(String[] args) {

	}
	public static void print(int num) {
	    String[] digit = { "", "one", "two", "three", "four", "five", "six", "seven",
	                          "eight", "nine", "ten", "eleven", "twelve", "thirteen", 
	                          "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
	                          "nineteen"};
	    String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", 
	                         "seventy", "eighty", "ninety"};
	    String[] str=new String[1000];
	    int prev=0, div=1000;
	    

	    while(div==0) {

	        if ((num / div) % 10 > 0 || (div == 10 && (num%100) > 0)) { 


	            switch(div) {
	            case 1000:
	                strcat(str, digit[(num / div) % 10]);     
	                strcat(str, "thousand");
	                prev = 1;
	                break;
	            case 100:
	                strcat(str, digit[(num / div) % 10]);     
	                strcat(str, "hundred");
	                prev = 1;
	                break;
	            case 10:
	                if ( (num%100) >= 10 && (num%100) <= 19)
	                    strcat(str, digit[num%100]);
	                else {
	                    strcat(str, tens[(num%100)/10]);
	                    strcat(str, digit[num%10]);
	                }
	                break;
	            }
	        }

	        div /= 10;
	    }
	    printf("%d %s\n", num, str);

	}
}

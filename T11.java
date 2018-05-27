
public class T11 {
public static void main(String[] args) {
int[] array = {4,7,1,0,8,8,5,5,3,0,1,8,3,9,6,8};
System.out.println(checkCredit(array));

}
public static boolean checkCredit(int[] digits) {
	       int sum = 0;
	       int length = digits.length;
	       for (int i = 0; i < length; i++) {

	           // get digits in reverse order
	           int digit = digits[length - i - 1];

	           // every 2nd number multiply with 2
	           if (i % 2 == 1) {
	               digit *= 2;
	           }
	           sum += digit > 9 ? digit - 9 : digit;
	       }
	       return sum % 10 == 0;
	   
}
}

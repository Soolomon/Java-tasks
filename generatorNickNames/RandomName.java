import java.util.Random;

public class RandomName {

	public static String generatorNickNames(int length) {
		char[] UpperCase = new String("QAZXWSDECVFRTGBNHYUJMKIOLP").toCharArray();
		char[] loud_letters_char = new String("aeyuoi").toCharArray();
		char[] consonant_letters_char = new String("qwrtpsdfghjklzxcvbnm").toCharArray();
		char[] nick_name = new char[length];
		Random random = new Random();
		boolean flag = false;
		nick_name[0] = UpperCase[random.nextInt(UpperCase.length)];

		for (int i = 1; i < length; i++) {
			for (char element : loud_letters_char) {
				if (nick_name[i - 1] == element) {
					flag = true;
					break;
				} else {
					flag = false;
				}
			}
			// false=consonant letters
			nick_name[i] = flag ? consonant_letters_char[random.nextInt(consonant_letters_char.length)]
					: loud_letters_char[random.nextInt(loud_letters_char.length)];
		}
		return new String(nick_name);

	}

}
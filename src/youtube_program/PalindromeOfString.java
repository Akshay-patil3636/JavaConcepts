package youtube_program;

public class PalindromeOfString {

	public static void main(String[] args) {

		String str = "ABc Ba";
		String str1=str.replaceAll("\\s", "");
		System.out.println(str1);

		String str2 = "";

		for (int i = str1.length() - 1; i >= 0; i--) {
			str2 = str2 + str1.charAt(i);

		}
		System.out.println(" Reverse String=" + str2);
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("String are palindrome");
		}
		else
		{
			System.out.println("String are not palindrome");

		}

	}
}

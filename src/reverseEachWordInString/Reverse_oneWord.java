package reverseEachWordInString;

public class Reverse_oneWord {
//	i/p="Hello Engineer";    o/p="Engineer olleH";

	public static void main(String[] args) {

			String str = "Hello Engineer";

			String[] str2 = str.split(" ");

			String str3 = "";

			for (int i = str2.length - 1; i >= 0; i--) {

				str3 = str3 + str2[i] + " ";

				if (str2[i].equals("Hello")) {

					char[] ch = str2[i].toCharArray();

					String str4 = "";
					for (int j = ch.length - 1; j >= 0; j--) {

						str4 = str4 + ch[j];
					}

					String str5 = str3.replace("Hello", str4);
					
					System.out.println(str5);
}}}}
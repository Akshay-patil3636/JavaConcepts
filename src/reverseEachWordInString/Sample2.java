package reverseEachWordInString;

public class Sample2 {

	public static void main(String[] args) {
		String str = "Akshay Patil";
		
		String arr[] = str.split(" ");
		String str1 = "";
		
		for (int i = arr.length - 1; i >= 0; i--) {
			str1 = str1 + arr[i]+" ";
			
			if (arr[i].equals("Akshay")) {
				
				char ch[] = arr[i].toCharArray();
				
					String str2 = "";
					for (int j = ch.length - 1; j >= 0; j--) {

						str2 = str2 + ch[j];
					}
					String str3=str1.replace("Akshay", str2);
					System.out.println(str3);

				
			}
		}

		}
	}


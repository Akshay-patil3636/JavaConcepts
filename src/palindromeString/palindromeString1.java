package palindromeString;

public class palindromeString1 {

	public static void main(String[] args) {
		String a=" a man a plan a canal panama ";
		String rev="";
		String b=a.replaceAll("\\s", "");
		System.out.println(b);
		for(int i=a.length()-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
			
		}
		System.out.println(rev);
		if(a.equals(rev))
		{
			System.out.println("String is palindrome");
			
		}
		else
		{
			System.out.println("String is not palindrome");
		}
			

	}

}

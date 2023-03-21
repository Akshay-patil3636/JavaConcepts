package reverseEachWordInString;

public class P2_reverse_long_String {
	public static void main(String[]args)
	{
		String str1="a man a plan a canal panama";
		String str2=str1.replaceAll("\\s", "");
	//	System.out.println(str2);
		String rev="";
		for(int i=str1.length()-1;i>=0;i--)
		{
			rev=rev+str1.charAt(i);
			
		}
		System.out.println("Original String="+str1);

		System.out.println("Reverse String="+rev);
				
				
		if(str1.equals(rev))
		{
			System.out.println("String are palindrome");
		}
		else
		{
			System.out.println("String are not palindrome");

		}
		
		
		System.out.println(" After removing space in String then");
		
		String rev2="";
		for(int i=str2.length()-1;i>=0;i--)
		{
			rev2=rev2+str2.charAt(i);
			
		}
		System.out.println("Original String="+str2);

		System.out.println("Reverse String="+rev2);
				
		
		if(str2.equals(rev2))
		{
			System.out.println("String are palindrome");
		}
		else
		{
			System.out.println("String are not palindrome");

		}
	}

}

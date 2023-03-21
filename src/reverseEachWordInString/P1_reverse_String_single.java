package reverseEachWordInString;

public class P1_reverse_String_single {
	public static void main(String args[])
	{
		String str1="Akshay";
		String rev="";
		for(int i=str1.length()-1;i>=0;i--)
		{
			rev=rev+str1.charAt(i);
			
			
		}
		
		System.out.println("Original String="+str1);

		System.out.println("Reverse String="+rev);
				
				
				
	}

}

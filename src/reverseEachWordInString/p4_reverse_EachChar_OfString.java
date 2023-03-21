package reverseEachWordInString;

import java.util.Arrays;

public class p4_reverse_EachChar_OfString {

	public static void main(String[] args) {
		String str="Akshay mahadev patil";             // o/p  yahska vedaham litap
		String []str1=str.split(" ");                     // [Akshay Mahadev patil]
		//System.out.println(Arrays.toString(str1));
	
		for(int i=0;i<str1.length;i++)
		{
			String str2=str1[i];
			String rev="";

			for(int j=str2.length()-1;j>=0;j--)
			{
				
				 rev=rev+str2.charAt(j);
			
			}
			str1[i]=rev;
		}

for(int i=0;i<str1.length;i++)
{
	System.out.print(str1[i] + "  ");
}
	}

}

package reverseEachWordInString;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseString_1 {
	public static void main(String[]args)
	{
		 String rev=" "; 
		String a="My name is";
		String b[]=a.split(" ");
		String c=Arrays.toString(b);
		System.out.println(c);

for(int i=b.length-1;i>=0;i--)
{
System.out.print(b[i]+" ");	
}
	}
//	String d=Arrays.toString(rev);
	
//	System.out.println(d);


	}


package reverseEachWordInString;

import java.lang.reflect.Array;
import java.util.Arrays;

public class p3_Reverse_Each_WordIn_String {
	public static void main(String[]args)
	{
		String str="Akshay Mahadev Patil";  // o/p   Patil Mahadev Akshay
		String[]arr=str.split(" ");
	//	String[]rev;
		System.out.println(Arrays.toString(arr));
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(" "+arr[i]) ;
		}
	}
	

}

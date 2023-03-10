package youtube_program;

import java.util.Arrays;

public class Factorial_ofNumber {

	public static void main(String[] args) {
		int a[]= {2,4,5,9};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
			if(a[i]<a[i+1])
			{
				int temp;
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				
			}}
		}
		System.out.println("Array in desc order="+Arrays.toString(a));

		
		
		
		
		
	}
	

}

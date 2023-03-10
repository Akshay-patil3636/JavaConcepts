package youtube_program;

import java.util.Arrays;

public class P14_Sumof_Elements_inArray {
	
	public static void main(String[] args) {
int a[]= {1,2,3,4,5};
int sum=0;
for(int i=0;i<a.length-1;i++)
{
	sum=sum+a[i];
}
System.out.println("Element of array="+Arrays.toString(a));
System.out.println("Number of element in array ="+a.length);
	System.out.println("sum of Array="+sum);		

	}

}

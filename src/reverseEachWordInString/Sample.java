package reverseEachWordInString;

public class Sample {
	

	public static void main(String[]args) {
		String str="Akshay Patil";
		
		
// rev each word i.e.        patil akshay mahadev
	/*	String []arr=str.split(" ");
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}    */
		
		
// rev each char i.e.      yahska vedaham litap
		
	/*	String word[]=str.split(" ");
		
		for(int i=0;i<word.length;i++)
		{
			String str1=word[i];
			String rev="";
			for(int j=str1.length()-1;j>=0;j--)
			{
				rev=rev+str1.charAt(j);
				
			}
			word[i]=rev;
			
		}
		for(int i=0;i<word.length;i++)
		{
			System.out.print(word[i]+" ");
		}       */
		
		
// rev string and rev each char of string   i.e  litap vedaham yahskA
		
		
	/*	String arr[]=str.split(" ");
	
		for(int j=arr.length-1;j>=0;j--)
		{
			String str1=arr[j];
			String rev="";
			for(int k=str1.length()-1;k>=0;k--)
			{
				rev=rev+str1.charAt(k);
			}
			arr[j]=rev;
		}
		for(int j=arr.length-1;j>=0;j--)
		{
			System.out.print(arr[j]+" ");
		}                                            */
		
// count occurances of each char
		
/*		int count[]=new int [300];
		//char arr[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			count[(int)str.charAt(i)]++;
		}
		for(int j=0;j<300;j++)
		{
			if(count[j]!=0)
			{
				System.out.println((char)j+" "+count[j]);
			}
		}                             */

		
// rev only second word                i.e    patil  yahskA		
	
	
	String arr[]=str.split(" ");
	
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.print(arr[i]+" ");
		{
			
		}
	}
	
	}

}

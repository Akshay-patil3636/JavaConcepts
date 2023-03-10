package youtube_program;

public class p15_Extract_Evenand_odd_numberFromArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int evenCount=1;
		int oddCount=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				evenCount++;
				System.out.print(a[i]+" ");
			}
			else
			{
				oddCount++;
			}
		}
		System.out.println("EvenNumbers="+evenCount);
		System.out.println("oddNumbers="+oddCount);
		
// odd number
		for(int i=0;i<a.length-1;i++)
		if(a[i]%2!=0)
		{
			System.out.print(a[i]+" ");
		}
	}

}

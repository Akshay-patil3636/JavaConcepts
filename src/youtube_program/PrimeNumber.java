package youtube_program;

public class PrimeNumber {

	public static void main(String[] args) {
		int a=6;
		int count=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				count++;
				
			}
		}
		if(count==2)
		{
			System.out.println("Number is prime");
		}
		else
		{
			System.out.println("Number is not prime");
		}

	}

}

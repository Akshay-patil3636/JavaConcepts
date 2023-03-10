package casting;

public class Narrowing_Casting {                 //  we can not cast boolean to any other
                                                 // we can not cast string to char
	public static void main(String[] args) {
		
		
		double x=10.0;
		float y=(float)x;
		int z=(int)y;
		char a='A';    // 2
		float b=a;             //4          boolean 1 byte
		
		boolean c=false;
	//	int d=(int)c;
		String str="Akshay";
	//	char f=(char)str;
		float t = 10.0f;
		String temp = Float.toString(t);
		System.out.println(temp);
		
		String str1="1234";              // 
		int w=Integer.parseInt(str1);     // 4
		System.out.println("Value of w After casting="+w);

		System.out.println("Value of x before casting="+x);
		System.out.println("Value of y After casting="+y);

		System.out.println("Value of z After casting="+z);
		System.out.println("Value of b After casting="+b);

	}

}

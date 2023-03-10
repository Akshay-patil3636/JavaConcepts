package Method_Overloading;

public class Demo_Class1 {
	
	public void method1()
	{
		System.out.println(" method1");
	}
	
	public void method1(int a)
	{
		System.out.println(a);
	}
	
//	public int method1(int a, int b)
//	{
//		int q=a+b;
//		System.out.println(q);
//		return q;
//	}
	public void method1(int a, int b, String c)
	{
		String s=a+b+c;
		System.out.println(s);
	}
	
	public void method1(int a, String b )      //Integer.toString();  int integer
	{
		String w=a+b;
		System.out.println(w);
	}
	public void method1(String a,int b)
	{
		String w=a+b;

		System.out.println(w);
	}
	
	
	
	public static void main(String[] args) {
		
		Demo_Class1 a=new Demo_Class1();
		
		a.method1(20,30,"10");
		
		
		

	}

}

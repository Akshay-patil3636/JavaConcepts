package keywords;

public class This_asArgument_InMethod {

	void method1(This_asArgument_InMethod obj)
	{
		System.out.println(" This is method1");
		
	}
	void method2()
	{
		method1(this);
		System.out.println("This is method2");
	}
	
	public int method3(int d)
	{
		System.out.println("This is mehod 3");
	return d;
	}
	public static void main(String[] args) {
		This_asArgument_InMethod t=new This_asArgument_InMethod();
		t.method2();
		t.method3(10);		

	}

}

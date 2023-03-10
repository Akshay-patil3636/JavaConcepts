package keywords;

public class This_return_CurrentClass_Instance {

	This_return_CurrentClass_Instance getA()
	{
		System.out.println("This is method A");
		return this;
	}
	int method2()
	{
		return 10;
	}
	void msg()
	{
		System.out.println("Hello Java");
	}
	
	
	public static void main(String[] args) {
		
		//new This_return_CurrentClass_Instance().getA().msg();
	//	new This_return_CurrentClass_Instance().msg();
		
		This_return_CurrentClass_Instance a=new This_return_CurrentClass_Instance();
		a.getA();
		a.msg();
		a.getA().msg();
	}

}



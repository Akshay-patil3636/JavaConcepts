package keywords;

public class This_As_constructor_argument {
	
	public This_As_constructor_argument()
	{
	System.out.println("This is default constructor");
	}
	public This_As_constructor_argument(This_As_constructor_argument obj )
	{
		
		System.out.println("This is parameterized constructor");
	}
	
	
	public void method1()
	{
		
		This_As_constructor_argument s=	new This_As_constructor_argument(this);
		System.out.println("This is method1 ");
	}

	public static void main(String[] args) {
		
		This_As_constructor_argument s1=	new This_As_constructor_argument();
		
		s1.method1();

	}

}

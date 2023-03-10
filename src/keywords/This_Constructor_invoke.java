package keywords;

public class This_Constructor_invoke {
	
	int a = 12;
	public This_Constructor_invoke()
	{
		this(15); 
		System.out.println("It is a default constructor");
	}

	public This_Constructor_invoke (int a) {
	
		         // to invoke current class constructor
		this.a = a;    // refer current class variable
		System.out.println("value of a="+a);
	}


	public static void main(String[] args) {
		
		This_Constructor_invoke a=new This_Constructor_invoke();
	//	This_Constructor_invoke v=new This_Constructor_invoke(18);

}}

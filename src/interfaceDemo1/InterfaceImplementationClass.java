package interfaceDemo1;

public class InterfaceImplementationClass implements InterfaceInJava{
	public static void staticMethodofclass()
	{
		System.out.println("Static method of class");
	}
	public void nonStaticMethodOfClass()
	{
		System.out.println("Non ststic Method of Class");
	}
	
	@Override
	  public void normalMethodOfInterf()
	  {
		  System.out.println(" overide mrtod of interface");
	  }

	
	
	
	@Override
	public void abstractMethodA() {
		System.out.println(" Abstract method A coming from Interface");
		
	}
	@Override
	public void abstractMethodB() {
		
		System.out.println(" Abstract method B coming from Interface");

	}

	public static void main(String[] args) {
		
		
		InterfaceImplementationClass i=new InterfaceImplementationClass();
		i.abstractMethodA();
		i.abstractMethodB();
		i.staticMethodofclass();
		i.nonStaticMethodOfClass();
		
		
		
		
		InterfaceInJava f=new InterfaceImplementationClass();
		f.abstractMethodA();
		f.abstractMethodB();
	//	f.staticMethodofclass();
	//	f.nonStaticMethodOfClass();
		
		
		
		f.defaultMethodFromInterface();
		
		InterfaceInJava.staticMethodC();     // we call static method using interface name
		
	//	f.staticMethodC();                    // static method of interface can not call by using reference f 

		
	//	InterfaceInJava v=new InterfaceInJava();
		

	}
	

}

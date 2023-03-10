package interfaceDemo1;

public interface InterfaceInJava {
	
	public static void main(String[]args)
	{
		//InterfaceInJava a= new InterfaceInJava();
		
		InterfaceInJava.staticMethodC();
	System.out.println("Value of variable="+InterfaceInJava.a);
	System.out.println("Value of variable="+InterfaceInJava.b);

	System.out.println("Value of variable="+InterfaceInJava.c);

	System.out.println("Value of variable="+InterfaceInJava.d);

	
	
	}
	int a=10;
	public final static int b=20;
	static int c=30;
	final int d=40;
	
	public abstract void abstractMethodA();
	
	public abstract void abstractMethodB();
	
	public static void staticMethodC()
	{
		System.out.println("Static method from interface ");
		
	}
	public default void defaultMethodFromInterface ()
	{
		System.out.println("Default method from interface ");
	}
//	public void normalMethodOfInterface()
//	{
//		System.out.println(" Normal mrthod of interface ");
//	}
//	public final void finalMethodOfInterface()
//	{
//		System.out.println(" Final method of interface ");
//	}
	
	private void privateMethodOfInterface()
	{
		System.out.println("Private method of Interface ");
	}
	
  public void normalMethodOfInterf();
//  {
//	  System.out.println("Normal method just");
//  }
	}



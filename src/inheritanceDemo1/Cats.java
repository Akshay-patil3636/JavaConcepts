package inheritanceDemo1;

public class Cats extends Animal{
	int cat=10;
	public void mow()
	{
		System.out.println(" Cats  mow mow mow");
	}
	public void eat()
	{
		System.out.println(" Cat eats a fish ");
	}
	
	
	private void catsPrivateMethod()
	{
		System.out.println(" Cats private method");
	
		
	}
	
	protected void catsProtectedMethod()
	{
		System.out.println(" Cats protected method ");
	}
	 
//	default void catsDefaultMethod()
//	{
//		System.out.println(" Cats default method ");
//	}
           static void catsStaticMethod()
           {
        	   System.out.println(" Cats Static Method");
           }
	
	
	public static void main(String[]args)
	{
		
//		Cats v=new Cats();
//		v.eat();
//		v.mow();
		Animal w=new Cats();
		w.eat();
		
	}

}

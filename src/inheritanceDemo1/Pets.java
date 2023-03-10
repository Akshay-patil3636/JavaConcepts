package inheritanceDemo1;

public class Pets extends Cats{
	
	
	public void petsMethod()
	
	{
		System.out.println("Pet method");
	}
	@Override
	public void eat()
	{
		System.out.println(" Child Cat eats a fish ");
	}
	
	private void catsPrivateMethod()
	{
		System.out.println(" Child Cats private method");
	
		
	}
	@Override
	protected void catsProtectedMethod()
	{
		System.out.println(" Child Cats protected method ");
	}
	
	
//	  static void catsStaticMethod()
//      {
//   	   System.out.println(" Child Cats Static Method");
//      }

	
	
	
	
	
	
	
	

//	public static void main(String[] args) {
//		Pets p=new Pets();
//		p.catsProtectedMethod();
//	//	p.catsPrivateMethod();
//		p.catsStaticMethod();
//		p.eat();
//		
		
//		Cats c=new Pets();
//		c.catsProtectedMethod();
//     //	c.catsPrivateMethod();
//		c.catsStaticMethod();
//		c.eat();
//		
		
		

	}


package inheritanceDemo1;

public class Dogs extends Animal {
	
	int dogs=10;
	public void Barks()
	{
		System.out.println("Dogs Barks loudly");
	}
	public void Loyal()
	{
		System.out.println(" Dogs are more Loyal than Human ");
	}
	
	 static  public void main(String[]args) {
		 
		 
		 
		 Dogs d=new Dogs();
		 d.Barks();
		 d.Loyal();
		 d.eat();
		 System.out.println(d.animal);
		 
		 d.animal=5;		 
	Animal a=new Dogs();
//	a.Barks();
//	a.Loyal();
//	a.eat();
//	
//	Animal s=new Animal();
//	s.Barks();
//	s.Loyal();
//	s.eat();
//	
	
	
	
}
	
	
	
}

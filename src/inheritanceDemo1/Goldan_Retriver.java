package inheritanceDemo1;

public class Goldan_Retriver extends Dogs {
	
	
	int GoldanR=5;
	public void colour()
	{
		System.out.println("Colour of Goldan Retriver is black");
	}
	
	public static void main(String[]args)
	{
		Goldan_Retriver g=new Goldan_Retriver();
		g.eat();
		g.Barks();
		g.Loyal();
		g.colour();
		
		
//		Dogs z=new Goldan_Retriver();
//		z.eat();
//		z.Barks();
//		z.Loyal();
//		z.colour();
//		
//		
//		Animal x=new Goldan_Retriver();
//		
//		x.eat();
//		x.Barks();
//		x.Loyal();
//		x.colour();
	}

}

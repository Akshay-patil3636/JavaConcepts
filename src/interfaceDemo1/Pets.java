package interfaceDemo1;

public class Pets implements Cats, Dogs{
	
public void eat()
{
	System.out.println(" All Animal eats a Fish ");
}

	public static void main(String[] args) {
		
		Pets p=new Pets();
		p.eat();
		p.Ak();
		//Cats q=new Pets();      //WebDriver driver=new ChromeDriver();
		//q.eat();
		

	}

}

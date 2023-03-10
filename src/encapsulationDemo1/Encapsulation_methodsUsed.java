package encapsulationDemo1;

public class Encapsulation_methodsUsed {
	private String name="Aishwarya";
	public void name1(String name)
	{
		this.name=name;
	}
	public String name2()
	{
		
		return name;
	}
	private int marks;
	public void setmarks(int marks)
	{
		if(marks>100)
		{
			this.marks=marks;
		}
		
	}
	public int getmarks()
	{
		return marks;
	}
	public static void main(String[]args)
	{
		
		Encapsulation_methodsUsed e=new Encapsulation_methodsUsed();
		e.name1("Akshay");
		 System.out.println(e.name2());
		 System.out.println(e.name);
		
		 
	    e.setmarks(20);
	    
		System.out.println(e.getmarks());
		
		
	}

}

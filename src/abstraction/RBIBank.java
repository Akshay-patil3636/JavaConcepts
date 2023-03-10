package abstraction;

public abstract class RBIBank {
	public static void main(String[]args) {
	}

	public abstract void interestRateofRBI();
	
	public abstract void currency();
	
	public void loanofRBI()
	{
		System.out.println("non static method  of RBI");
	}
	public static void staticMethodOfRbi()
	{
		System.out.println(" static method of RBI  ");
	}

	public void nationality()
	{
		System.out.println(" overridden non static method of RBI citizen");
	}
	 public RBIBank()
	 {
		 System.out.println(" Constructor of RBI Bank ");
	 }
	 
	 public RBIBank(String name)
	 {
		 System.out.println("parameterized constructor of RBIBank" +name);
	 }
	}
	


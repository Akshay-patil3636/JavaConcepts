package abstraction;

public class ICICI extends RBIBank{
	public void nationality()
	{
		System.out.println(" non static method is  of RBI citizen");
	}
	
	public static void ICICILoan()
	{
		System.out.println(" INterest rate of ICICI is 6% ");
	}
	public void ICICIInterestRate()
	{
		System.out.println(" Interest rate of ICICI is 6.5% ");
	}

	
	public void interestRateofRBI()
	{
		System.out.println(" Interest rate of RBI is 2% ");
	}
	
	public void currency()
	{
		System.out.println(" Currency of RBI is RS ");
	}
	public static void main(String[] args) {
		
//	ICICI i=new ICICI();
//		i.currency();
//		i.interestRateofRBI();
//		i.ICICILoan();
//		i.ICICIInterestRate();
//	i.nationality();
//		i.loanofRBI();
//		
		RBIBank r=new ICICI();
		
		r.staticMethodOfRbi();
		RBIBank.staticMethodOfRbi();
		
	//r.currency();
	//r.interestRateofRBI();
	//	r.ICICILoan();
	//	r.ICICIInterestRate();
  //  r.nationality();
	//r.loanofRBI();
		}
//public ICICI()
//{
//	super();
//	
//	System.out.println(" Constructor of ICICI ");
//}
//public ICICI(String name)
//{ this();
//	
//	
//	 System.out.println("parameterized constructor of ICICI" +name);
//}



	}

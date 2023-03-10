package Method_Signature;

public class Demo_Class1 {
	public static int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }
	
	public  String method2(String Fname, String Lname)
	{
		String str=Fname.concat(Lname);
		return str;
	}

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int result = Demo_Class1.addNumbers(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + result);
   
        
        Demo_Class1 s=new Demo_Class1();
    
    String str1=s.method2("Akshay", "Patil");
    
    System.out.println(str1);
    
    
    }
    
}


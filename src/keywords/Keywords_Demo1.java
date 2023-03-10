package keywords;

public class Keywords_Demo1 {

	int a = 12;

	public Keywords_Demo1(int a)
	{
		this.a = a;    // refer current class variable
		System.out.println("value of a="+a);
	}


	public static void main(String[] args) {
		
		Keywords_Demo1 k=new Keywords_Demo1(13);
		//k.method1(13);
		

	}

}

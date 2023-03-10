package occurances_Of_Char;

public class Using_Asci_Value {

	public static void main(String[] args) {
    String str1="Akshay Mahadev Patil";

    int count[]=new int[300];
    
    for(int i=0;i<str1.length();i++)
    {
    	count[(int)str1.charAt(i)]++;
    	
    }
    for(int i=0;i<300;i++)
    	if(count[i]!=0)
    {
    	System.out.println((char)i+"="+count[i]);
    }
    
	}

}

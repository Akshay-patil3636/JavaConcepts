package youtube_program;

public class Person {
	
	    private String name;
	    private int age;

	    public Person(String name, int age) {
	        this.name =name ;
	        this.age = age;
	    }

	    public void sayHello() {
	        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
	    }
	    
	    public static void main(String[]args)
	    {
	    	Person p= new Person("Akshay",22);
	    	p.sayHello();
	    	
	    	
	    }

}

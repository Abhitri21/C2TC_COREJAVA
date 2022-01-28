
public class Method_Overloading1 {
      
	public void m (Object o)
	{
		System.out.println("Object Class");
		
	}
	
	public void m (String s)
	{
		System.out.println("String Class");
	}
	
	
	public static void main (String[] args ) {
		
		Method_Overloading1 obj = new Method_Overloading1();
		obj.m(new Object());
		
		obj.m("Abhishek");
		
		obj.m(null);
	}
}

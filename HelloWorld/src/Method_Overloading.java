
public class Method_Overloading 
{

	public void m()
	{
		System.out.println("No parameters");
	}
	public void m(int i)
	{
		System.out.println("I am Integer Method");
		
	}
	public void m(double d)
	{
		System.out.println("I am Double Method");
	}
	
	public static void main(String[] args) {
		
		Method_Overloading obj=new Method_Overloading();
		obj.m();
		obj.m(8);
		obj.m(2.5);
	}
	
}

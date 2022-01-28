import java.util.Scanner;
public class CustomizeException1 {

	public static void main(String[] args) throws CantDrive
	
	{
		int age;
		System.out.println("Enter Your Age");
		Scanner s=new Scanner(System.in);
		age=s.nextInt();
		
		if(age<18)
		{
			throw new CantDrive("You are not Eligible for Driving License.");
		}
		else
		{
			System.out.println("You are Eligible for Driving License.");
			
		}
		

	}

}
class CantDrive extends Exception
{
	CantDrive (String msg)
	{
		super(msg);
	}
}

public class String1 {

	public static void main(String[] args) {
		{
			String s=new String("Abhishek Tripathi");
			
			
			System.out.println(s.length());
			
			System.out.println(s.toLowerCase());
			
			System.out.println(s.toUpperCase());
			
			String s1= ("BANGLORE");
			
			System.out.println(s1.equals("banglore"));
			
			System.out.println(s1.equalsIgnoreCase("banglore"));
			
			System.out.println(s.trim());
			
			System.out.println(s1.isEmpty());
			
			System.out.println(s1.contains(s1));
			
			System.out.println(s.substring(6));
			
			System.out.println(s.substring(4,13));
			
			String Firstname=new String("Abhishek");
		    String Lastname=new String("Tripathi");
		    
		    System.out.println(Firstname.concat(Lastname));
		    
		    System.out.println(Firstname+ ".A." +Lastname);
		    
		    StringBuffer s2=new StringBuffer("MUMBAI");
		    
		    System.out.println(s1.contentEquals(s2));
		    
		    System.out.println(s1.replace("A", "T"));
		    
		    String a= "Avantika";
		      int b=10,c=20,d=30;
		      
		      System.out.println(a+b+c+d);
		      System.out.println(b+c+d+a);
		      System.out.println(b+c+a+d);
		      System.out.println(b+a+c+d);
		}

	}

}

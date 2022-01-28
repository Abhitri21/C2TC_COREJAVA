
public class Student {
	  
	String name;
	int roll,age;
     
	public Student(String name,int roll,int age)
	{    
		 this.name=name;
		 this.roll=roll;
		 this.age=age;
		
	}
   public static void main(String[] args) {
	   
	   Student s1= new Student("Abhishek",1,21);
	   Student s2= new Student("Nick",2,22);
	   
	   System.out.println(s1.name+" "+s1.roll+" "+s1.age);
	   
	   System.out.println(s2.name+" "+s2.roll+" "+s2.age);
   }
}

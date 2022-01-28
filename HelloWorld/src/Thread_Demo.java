
class MyThread implements Runnable 
{
      public void run()
      {
    	  for(int i=0;i<10;i++)
    	  {
    		  System.out.println("Child Thread");
    	  }
      }
}

public class Thread_Demo 
{
	public static void main (String[] args)
	{
		MyThread m=new MyThread();
		Thread t=new Thread();
		t.start();
		
		System.out.println("********");
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		
		for (int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}
		
	}
}
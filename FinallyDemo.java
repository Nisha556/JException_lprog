package Exception;

public class FinallyDemo {
	static void procA()
	{
		try {
			System.out.println("inside ProcA");
			throw new RuntimeException("demo");
			
		}
		finally {
			System.out.println("procA's finally");
			
		}
		
	}
	
static void procB()
{
	try {
		System.out.println("inside proB");
		return;
		
	}
	finally {
		System.out.println("procBs finally");
		
	}
}
static void procC()
{
	try {
		System.out.println("inside procC");
		
	}
	finally {
		System.out.println("procC's finally");
		
	}
}
public static void main(String args[])
{
	try {
		procA();
		
	}
	catch(Exception e)
	{
		System.out.println("Exception caught");
		
	}
	procB();
	procC();
	
}
}

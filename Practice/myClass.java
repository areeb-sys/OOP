public class myClass
{
	public static void main(String[] args)
	{
		myClass myObject = new myClass();
		
		myStaticMethod();
		myObject.myPublicMethod();
	}
	static void myStaticMethod()
	{
		System.out.println("Static method do not need to create an object");
	}
	public void myPublicMethod()
	{
		System.out.println("Public method always need to be created an object");
	}
}
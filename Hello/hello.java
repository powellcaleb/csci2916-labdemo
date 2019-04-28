public class hello 
{

	public static void main(String[]args)
	{
		String msg = "";
		int age = 18;

		System.out.println(greeting(msg));
		System.out.println("I am "+age+" years old.");
	}
	
	public static String greeting(String msg)
	{
		msg = "hello";
		return msg;
	}
}

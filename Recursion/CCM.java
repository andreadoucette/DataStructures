public class CCM 
{
	public static void main (String[] p) 
	{
		Recursion i = new Recursion();
		int result;

		result = i.Sum(60);
		System.out.println("The sum from 1 to 60, using recursion is: " + result);
		result = i.LoopSum(60);
		System.out.println("The sum from 1 to 60, using iteration is:" + result);
	}
}


public class AListDemo
{
	public static void main (String[] args)
       	{
		try
       		{
			AList myList = new AList(50);
			System.out.println("" + myList);
			myList.add("Milk");
			myList.add("Bread");
			myList.add("Sugar");
			System.out.println("Added % items");
			System.out.println("The itmes are:\n " + myList);
			System.out.println("Now deleting last item");
			myList.delete();
			System.out.println("The new list: " + myList);
		}
		catch (ListException e)
	       	{
			System.out.println(e);
		}	
	}//End of main
}//End of class

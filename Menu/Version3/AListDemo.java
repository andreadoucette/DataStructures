public class AListDemo
{
	public static void main (String[] args)
	{
		try
		{
			AList<House> hlist = new AList<House>(10);
			House h1 = new House("31 Main St.");
			House h2 = new House("5 Cranberry Rd.");
			House h3 = new House("22 Rail Rd.");
			hlist.add(h1);
			hlist.add(h2);
			hlist.add(h3);
			System.out.println("My houses are at: " + hlist);

			AList<Car> clist = new AList<Car>(5);
			clist.add(new Car("Ford"));
			clist.add(new Car("Volvo"));
			System.out.println("My cars are:" + clist);
		}
		catch(ListException e)
		{
			System.out.println(e);
		}
	}
}

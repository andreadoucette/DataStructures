//Notes
//-As writing this class keep in mind that 
//you need to think about what the client is doing

public class AList implements ListInterface
{
	private	String[] L;
	private int counter;

	public AList(int s) 
	{
		L = new String[s]; //Allows client to decide what length is
		counter = 0;
	}
	public void add(String item) throws ListException
       	{
		if (counter == L.length) 
		
			throw new ListException("Cannont add: LIST FULL!");
			L[counter] = item;
			counter++;
		 

	}

	public String toString()
       	{
		int k;
		if (counter == 0)
	       	{
			return	("The List is Empty");
		}
		String temp = "";
		for (k = 0; k < counter; k++) 
		{
			temp += L[k] + "\n";
			return temp;
		}
		return temp;
	}

	public void delete() throws ListException 
	{
		if (counter == 0)
		
		throw new ListException ("Cannot delete: LIST EMPTY!");
		counter --;
		
		
	}
}


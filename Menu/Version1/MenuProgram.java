import java.util.Scanner;
public class  MenuProgram
{
	public static void main (String[] args)
       	{
		Scanner i = new Scanner(System.in);
		String [] L = new String[4];
		int count = 0;
		int option; //Holds user's response

		System.out.println("1. Add item\n2. Delete item\n3. Print List\n4. Exit\nEnter Choice: ");
		option = i.nextInt();
		i.nextLine(); //Clears the buffer
		while (option != 4)
	       	{
			if (option == 1)
		       	{				
				if (count < L.length ) //Add item
			       	{
					String t;
					System.out.println("Enter item to add: ");
					t = i.nextLine();
					L[count] = t;
					count++;
				}
				else
					System.out.println("Item Limit Reached");
			}
			else if (option == 2) //Delete item
		       	{
				if (count > 2)
				{
					count--;
				}
				else
					System.out.println("There is nothing to delete.");

			else if (option == 3) //Print list 
			{
				int k;
				for (k = 0; k < count; k++)
		       		{
					System.out.println(L[k]);
				}
			}
			else
			{
				System.out.println("You chose option 2");
			}

			System.out.println("1. Add item\n2. Delete item\n3. Print List\n4. Exit\nEnter Choice: ");
			option = i.nextInt();
			i.nextLine(); //Clears the input buffer
		}
	}	
}

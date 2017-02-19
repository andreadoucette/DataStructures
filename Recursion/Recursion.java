public class Recursion 
{
		
		//A recursive method, which
		//calculates the sum from 1
		//to n.
		public int Sum ( int n) 
		{
			if ( n != 0) 
			{
				return n + Sum(n -1);
			}
			else 
				return 0;
		}


		//An iterative method, which 
		//calculates the sum from 1 
		//to n.
		public int LoopSum ( int n ) 
		{
			int total = 0;
			int k;
			for ( k = 1; k <= n; k++) 
			{
				total += k;
			}
			return total;

		}
			
}


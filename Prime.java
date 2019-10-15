public class Prime{
	
	public static void main(String[] args) 
	{
		int i, count = 0;
		for(i=2; i<=20000; i++)
		{
			if(isPrimeNumber(i) == true)
			{
				count++;
				System.out.printf("%6d",i);
				if(count%5 == 0)
				System.out.println();
			}
		}
	}
	
	public static boolean isPrimeNumber(int num)
	{
		int k = (int) Math.sqrt(num);
		if(num == 2)
		return true;
		for(int i=2; i<=k; i++)
		if(num%i == 0)
		return false;
		return true;
	}
}
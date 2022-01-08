class SwapFact
{
	public int v1, v2, n;
	
	public SwapFact(int v1, int v2, int n)
	{
		this.v1 = v1;
		this.v2 = v2;
		this.n = n;
	}
	
	public void Swap()
	{
		System.out.println("Values Before Swapping :");
		System.out.println("V1 = " + this.v1);
		System.out.println("V2 = " + this.v2);
		
		System.out.println();

		this.v1 += this.v2;
		this.v2 = this.v1 - this.v2;
		this.v1 -= this.v2;
		
		System.out.println("Values After Swapping :");
		System.out.println("V1 = " + this.v1);
		System.out.println("V2 = " + this.v2);
	}
	
	public void Fact()
	{
		int fact = this.n;
		for(int i=fact-1; i>=1; i--)
		{
			fact *= i;
		}
		
		System.out.println("Factorial of " + this.n + " is " + fact);
	}
}

class Main
{
	public static void main(String args[])
	{
		SwapFact sf = new SwapFact(10,13,5);
		sf.Swap();
		System.out.println();
		sf.Fact();
	}
}
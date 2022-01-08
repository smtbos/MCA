class Palindrome
{
	public int n;
	
	public Palindrome(int n)
	{
		this.n = n;
	}
	
	public void Check()
	{
		int temp = this.n;
		int rev = 0;
		int mod;
		
		while(temp > 0)
		{
			mod = temp%10;
			rev = rev*10 + mod;
			temp = temp/10;
		}
		
		if(rev == this.n)
		{
			System.out.println(this.n + " is Palindrome.");
		}
		else
		{
			System.out.println(this.n + " is Not Palindrome.");
		}
		
	}
	
}

class Main
{
	public static void main(String args[])
	{
		for(int i=0; i<args.length; i++){
			Palindrome p = new Palindrome(Integer.parseInt(args[i]));
			p.Check();
		}
	}
}
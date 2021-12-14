package Series;

public class FibonacciRecursion {

	int a=0,b=1,c;
	public static void main(String[] args) {
		
		
		FibonacciRecursion fb=new FibonacciRecursion();
		fb.printFib(10);
		
		
	}
	void printFib(int i)
	{
		if(i>=1)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			printFib(i-1);
		}
	}

}

package Series;

public class Armstrong {

	public static void main(String[] args) {
		int no=153;
		int t1=no;
		int length=0;
		
		//finding length eg 153 has length 3.
		while(t1!=0)
		{
			
			t1=t1/10;
			length=length+1;
		}
		
		//reverse no logic
		int t2=no;
		int arm=0;
		while(t2!=0)
		{
			int mul=1;
			int rem=t2%10;
			for(int i=1;i<=length;i++)
			{
				mul=mul*rem;
			}
			arm=arm+mul;
			t2=t2/10;
		}
		if(no==arm)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not a Armstrong number");
		}
	}

}

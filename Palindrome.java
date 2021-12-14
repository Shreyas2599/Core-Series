package Series;

public class Palindrome {

	public static void main(String[] args) {
		int no=141;
		int temp=no;
		int rem,rev=0;
		
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(no==rev)
		{
			System.out.println(no+" is Palindrome");
		}
		else
		{
			System.out.println(no+" Not a Palindrome Number");
		}
	}

}

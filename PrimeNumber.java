package week1.day1;

public class PrimeNumber 
{
	public static void main(String[] args) {
		int num =13;
		boolean flag =false;
		int remainder;
		for(int i=2;i<=num/2;i++)
		{
			remainder =num%i;
if(remainder==0)
{
	flag=true;
	break;
	
}
		}
		if(!flag)
		{
			System.out.println(num + " Is A Prime Number ");
			
		}
		else
		{
			System.out.println(num + "Is Not A Prime Number");
		}
	}
}


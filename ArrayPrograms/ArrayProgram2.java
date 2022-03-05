import java.util.Scanner;
class EvenOrOddProgram
{	
	int numarr[];
	public int[] getNumber()
	{
		return this.numarr;
	}
	public void setNumber(int[] numarr)
	{
		this.numarr=numarr;
	}
	public void method()
	{
		int evencount=0,oddcount=0;
		for(int i=0;i<numarr.length;i++)
		{
			int num=numarr[i];
			if(num%2==0)
			{
				++evencount;
			}
			else
			{
				++oddcount;
			}
		}
		int evenarr[]=new int[evencount];
		int oddarr[]=new int[oddcount];
		int a=0,b=0;
		for(int i=0;i<numarr.length;i++)
		{
			int num=numarr[i];
			if(num%2==0)
			{
				evenarr[a]=num;
				++a;
			}
			else
			{
				oddarr[b]=num;
				++b;
			}
		}
		System.out.println("Even Number's are :");
		for(int c:evenarr)
		{
			System.out.println(c);
		}
		System.out.println("Odd Number's are :");
		for(int d:oddarr)
		{
			System.out.println(d);
		}
	}
}
class ArrayProgram2
{
	public static void main(String[] args)
	{
	   try
	    {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number of Element's to Insert and check even or odd");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter "+n+" Element's into Array to check even or odd");
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		EvenOrOddProgram obj=new EvenOrOddProgram();
						  obj.setNumber(arr);
						  obj.method();
	   }
	  catch(Exception e)
	   {
		System.out.println("Exception : Enter only Integers in Number of Element's to Insert/Element's into Array");
	   }
	}
}
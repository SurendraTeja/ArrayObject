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
class ArrayProgram1
{
	public static void main(String[] args)
	{
		int arr[]={1,2,3,4,5,6,7,8,9,10,12};
		EvenOrOddProgram obj=new EvenOrOddProgram();
						  obj.setNumber(arr);
						  obj.method();
	}
}
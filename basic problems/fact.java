public class fact
{
       public static void main(String[] args)
       {
                 int f=1;
		int l = args.length;
		if(l<=0)
		{
			System.out.print("\nMissing Arguments");
		}
		else if(l>1)
		{
			System.out.print("\nToo Many Arguments");
		}
		else 
		{
			int n = Integer.parseInt(args[0]);
			for(int i=1;i<=n;i++)
				f = f*i;
			System.out.print("\nFactorial is : "+f);
		}
       }
}
                 
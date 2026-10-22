public class sum
{
      public static void main(String[] args)
      {
                 int s=0;
                 int l=args.length;
                 for(int i=0;i<l;i++){
                           s=s+ Integer.parseInt(args[i]);
                 }
                 System.out.println("sum: "+s);
      }
}
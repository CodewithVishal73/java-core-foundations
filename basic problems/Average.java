public class Average
{
         public static void main(String[] args)
         {
                     int s=0,A=0;
                     int l=args.length;
                     for(int i=0;i<l;i++){
                              s=s+ Integer.parseInt(args[i]);
                     }
                     A=s/l;
                     System.out.println("Average: "+A);
        }
}
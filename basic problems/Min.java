public class Min
{
        public static void main(String[] args)
        {
                     int l;
                     l=args.length;
                     int min=Integer.parseInt(args[0]);
                     for(int i=0;i<l;i++)
                     {
                            if(Integer.parseInt(args[i])<min){
                                     min=Integer.parseInt(args[i]);
                            }
                     }
                     System.out.println("Min: "+min);
         }
}
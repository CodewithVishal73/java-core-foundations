public class Max
{
        public static void main(String[] args)
        {
                     int l;
                     l=args.length;
                     int max=Integer.parseInt(args[0]);
                    if(l>0){
                     for(int i=0;i<l;i++)
                     {
                            if(Integer.parseInt(args[i])>max){
                                     max=Integer.parseInt(args[i]);
                            }
                     }
                    }
                    else{
                         System.out.println("Missing argument");
                     }
                     System.out.println("Max: "+max);
         }
}
public class power
{
            public static void main(String[] args)
            {
                       int m=1;
                       int r=Integer.parseInt(args[1]);
                       for(int i=0;i<r;i++){
                                m=m* Integer.parseInt(args[0]);
                       }
                       System.out.println("power: "+m);
            }
}
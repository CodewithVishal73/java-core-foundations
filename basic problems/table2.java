public class table2
{
        public static void main(String[] args)
        {
                  int l=args.length;
                  if(l>2)
                  {
                      System.out.println("Too many arguments");
                  }
                  else if(l<2)
                  {
                        System.out.println("Missing arguments");
                  }
                  else{
                  	int a1=Integer.parseInt(args[0]);
                  	int a2=Integer.parseInt(args[1]);
                        if(a1<a2){
                       		 System.out.println("Table b/w a1 and a2:");
                  		for(int i=a1+1;i<a2;i++){
                       			for(int j=1;j<=10;j++){
                              		 	System.out.println(i*j);
                       			}
                       			System.out.print("\n --------------\n");
                  		}
                        }
                        else{
                             System.out.println("second argument must be greater than first argument");
                        }
                 }
         }
}
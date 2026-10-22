import java.util.Scanner;
public class Q17
{
        public static void main(String[] args){
		      int i,m=1,c=0,r,sm=0,j;
                      Scanner s= new Scanner(System.in);
	              System.out.print("\nenter number:");
		      int n= s.nextInt(); 
		      for(i=n;i>0;i=i/10){
				 c++;
		      }
		      for(i=n;i>0;i=i/10){
				r=i%10;
		     		for(j=0;j<c;j++){
					m=m*r;
		      		 }
				sm=sm+m;
				m=1;
                      }
		      if(sm==n)
				System.out.println("it is Armstrong number");
		      else
				System.out.println("it is not a Armstrong number");
	}
}
import java.util.Scanner;
public class a40{
     public static void main(String [] args){
                         Scanner s= new Scanner(System.in);
			 System.out.println("enter range:");
			 int n= s.nextInt();
			 int [] ar= new int[n];
                         System.out.println("enter array elements:");
			 for(int i=0;i<n;i++){
				 ar[i]= s.nextInt();
			 }
                          int max= ar[0];
			  int min= ar[0];
			  for(int i=0;i<n;i++){
				 if(ar[i]>max)
					max=ar[i];
				 if(ar[i]<min)
					min=ar[i];
		
			  }
			  System.out.println("max :"+max);
			  System.out.println("min :"+min);	
                          s.close();
 	}
}
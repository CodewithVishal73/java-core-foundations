import java.util.Scanner;
import java.util.*;
public class s8
{
	public static void main(String [] args){
			Scanner s= new Scanner(System.in);
			System.out.println("enter string:");
			String st= s.nextLine();
		        for(int i=0;i<st.length();i++){
                              if((97+i)<=122){
                                    System.out.println("index of :"+(97+i)+" :"+st.indexOf(97+i));
			      }
			}

			s.close();
	}
}
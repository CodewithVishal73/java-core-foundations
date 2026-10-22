import java.util.Scanner;
import java.util.*;
public class s15
{
	public static void main(String [] args){
			Scanner s= new Scanner(System.in);
			System.out.println("enter string:");
			String sh= s.nextLine();
			int max=0;
			char rep=sh.charAt(0);
			int cnt=0;
                        for(int i=0;i<sh.length();i++){
			    cnt=0;
			    for(int j=i;j<sh.length();j++){
				      if(sh.charAt(i)==sh.charAt(j)){
						cnt++;
				      }
				      if(cnt>max){
						max=cnt;
						rep= sh.charAt(i);
				      }
						   
			    }
			}
			System.out.println("most occurred character in string:"+rep);
			s.close();
	}
}
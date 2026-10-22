import java.util.Random;
import java.util.Scanner;
import java.util.*;
public class ran9{
        public static void main(String[] args){
			Random r= new Random();
			Scanner s= new Scanner(System.in);
			String subjects[] = new String[4];
			String verbs[] = new String[4];
			String objects[] = new String[4];
			for(int i=0;i<4;i++){
				System.out.println("enter subject:");
				subjects[i]= s.nextLine();
				System.out.println("enter verb:");
				verbs[i]= s.nextLine();
				System.out.println("enter object:");
				objects[i]= s.nextLine();
			}
			int i1= r.nextInt(subjects.length);
			int i2= r.nextInt(verbs.length);
			int i3= r.nextInt(objects.length);
			String sentence= subjects[i1]+" "+verbs[i2]+" "+objects[i3];
			System.out.println(sentence);
			s.close();
	}
}
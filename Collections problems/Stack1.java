import java.util.*;
public class Stack1{
          public static void main(String [] args){
                        Scanner s = new Scanner(System.in);
                        System.out.println("Enter String:");
                        String st= s.nextLine();
                        Stack<Character> stack= new Stack<Character>();
                        for(int i=0;i<st.length();i++){
                              stack.push(st.charAt(i));
                        }
                        String reverse="";
                        for(int i=0;i<st.length();i++){
                              reverse+= stack.pop();
                        }
                        System.out.println("Reverse string : "+reverse);
          }
}
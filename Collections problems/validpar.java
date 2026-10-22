import java.util.*;
public class validpar{
           public static void main(String [] args){
                        Scanner s= new Scanner(System.in);
                        System.out.println("\nEnter Expression : ");
                        String exp= s.nextLine();
                        Stack<Character> stack= new Stack<Character>();
                        boolean balanced=true;
                        for(char c : exp.toCharArray()){
                                 if(c=='(' || c=='{' || c=='['){
                                      stack.push(c);
                                 }
                                 else if(c==')' || c=='}' || c==']'){
                                         if(stack.isEmpty()){
                                               System.out.println("\nNo Balanced");
                                               balanced=false;
                                               break;
                                         }
                                         char top= stack.pop();
                                         if((c==')' && top!='(') || (c=='}' && top!='{') || (c==']' && top!='[')){
                                              System.out.println("Not Balanced");
                                              balanced=false;
                                              break;
                                         }
                                 }
                        }
                        if(balanced){
                              if(stack.isEmpty()){
                                  System.out.println("Balanced");
                              }
                              else{
                                    System.out.println("Not Balanced");
                              }
                        }
           }
}
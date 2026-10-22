import java.util.*;
public class undoredo{
         public static void main(String [] args){
                   Scanner s = new Scanner(System.in);
                   Stack<String> undo= new Stack<String>();
                   Stack<String> redo= new Stack<String>();
                   String curr="";
                   boolean run=true;
                   int choice;
                   do{
                         System.out.println("Your Current Text : "+curr);
                         System.out.println("1. Type\n2. undo\n3. redo\n0. Exit");
                         System.out.println("Enter your choice : ");
                         choice= s.nextInt();
                         s.nextLine();

                         switch(choice){
                                    case 1:
                                         System.out.println("Enter your text : ");
                                         String text= s.nextLine();
                                         undo.push(curr);
                                         curr= text;
                                         redo.clear();
                                         break;
                                    case 2:
                                        if(!undo.isEmpty()){
                                             redo.push(curr);
                                             curr=undo.pop();
                                        }
                                        else{
                                            System.out.println("undo stack is empty");
                                        }
                                        break;
                                    case 3:
                                        if(!redo.isEmpty()){
                                             undo.push(curr);
                                             curr=redo.pop();
                                        }
                                        else{
                                            System.out.println("redo stack is empty");
                                        }
                                        break;
                                    case 0:
                                           System.out.println("Exiting...");
                                           run=false;
                                           break;
                                    default:
                                         System.out.println("Invalid choice..");
                         }
                   }while(run);
                   s.close();
         }
}
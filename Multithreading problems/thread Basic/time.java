import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
class mythread extends Thread{
       public void run(){
           while(true){
                    LocalTime current= LocalTime.now();
                    DateTimeFormatter f= DateTimeFormatter.ofPattern("HH:mm:ss");
                    String Time= current.format(f);
                    System.out.println("Current Time : "+Time);
                    try{
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException e){
                            System.out.println("clock Interrupted");
                            break;
                    }
           }
       }
}
public class time{
       public static void main(String [] args){
                mythread t1= new mythread();
                t1.start();
       }
}
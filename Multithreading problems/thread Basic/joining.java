class mythread extends Thread{
       public void run(){
          while(true){
                System.out.printf("\nBackgrounnd Task running..");
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
          }
       }
}
public class joining{
       public static void main(String [] args)throws InterruptedException{
                mythread t1= new mythread();
                t1.setDaemon(true);
                t1.start();
                System.out.printf("\nMain Thread is running");
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
                System.out.printf("\nMain Thread is finished");
       }
}
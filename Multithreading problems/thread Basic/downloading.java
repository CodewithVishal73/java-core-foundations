class mythread extends Thread{
       private String filename;
       mythread(String filename){
             this.filename=filename;
       }
       public void run(){
           System.out.println(filename+" Starts downloading....\n");
           for(int i=1;i<=20;i++){
                   System.out.println("Downloading : "+(i*5)+"% downloaded");
                    try{
                        Thread.sleep(300);
                    }
                    catch(InterruptedException e){
                            e.printStackTrace();
                    }
           }
       }
}
public class downloading{
       public static void main(String [] args){
                mythread t1= new mythread("whatsapp");
                t1.start();
       }
}
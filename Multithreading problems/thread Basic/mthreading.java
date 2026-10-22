class mythread extends Thread{
       private int n;
       mythread(int n){
             this.n=n;
       }
       public void run(){
           for(int i=1;i<=10;i++){
                  System.out.println(n+" * "+i+" : "+(n*i));
                    try{
                        Thread.sleep(500);
                    }
                    catch(InterruptedException e){
                            e.printStackTrace();
                    }
           }
       }
}
public class mthreading{
       public static void main(String [] args){
                mythread t1= new mythread(2);
                mythread t2= new mythread(3);
                mythread t3= new mythread(4);
                t1.start();
                t2.start();
                t3.start();
       }
}
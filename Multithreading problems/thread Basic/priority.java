class MyThread extends Thread{
         private int x;
         MyThread(int x){
            this.x=x;
         }
         public void run(){
              System.out.println("\nthread "+x+" is running");
         }
}
public class priority{
     public static void main(String [] args){
                MyThread t1= new MyThread(1);
                MyThread t2= new MyThread(2);
                MyThread t3= new MyThread(3);
                t1.setPriority(Thread.MIN_PRIORITY);
                t2.setPriority(Thread.NORM_PRIORITY);
                t3.setPriority(Thread.MAX_PRIORITY);

                t1.start();
                t2.start();
                t3.start();
     }
}
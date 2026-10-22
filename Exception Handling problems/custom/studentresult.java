class Student
{
    String name;
    int [] marks= new int[5];
    Student(String name, int [] marks){
         this.name=name;
         this.marks=marks;
    }
    void result() throws InvalidMarksException{
              for(int i=0;i<marks.length;i++){
                      if(marks[i]<0 || marks[i]>100){
                               throw new InvalidMarksException("marks of "+(i+1)+" Subject is invalid");
                      }
              }
              long sum= 0;
              double percentage;
              for(int i=0;i<marks.length;i++){
                     sum+=marks[i];
              }
              percentage= (double)sum/marks.length;
              if(percentage>=40){
                   System.out.println("Result : Pass");
              }
              else{
                  System.out.println("Result : Fail");
              }
    }
}
class InvalidMarksException extends Exception
{
    InvalidMarksException(String msg)
    {
        super(msg);
    }
}
public class studentresult 
{
    public static void main(String [] args)
    {
        int[] marks= {65,70,81,102,94};
        Student s = new Student("Aman",marks);
        try
        {
            s.result();
        }
        catch(InvalidMarksException e)
        {
            System.out.print(e.getMessage());
        }
    }
}
class demo 
{
    double calculatesalary(int hours,double rate) throws InvalidHoursException{
        if(hours<0)
        {
            throw new InvalidHoursException("Hours worked invalid");
        }
        return hours*rate;
    }
}
class InvalidHoursException extends Exception
{
    InvalidHoursException(String msg)
    {
        super(msg);
    }
}
public class Salary
{
    public static void main(String [] args)
    {
        demo d = new demo();
        try
        {
            System.out.println("Salary : "+d.calculatesalary(-1,255.65));
        }
        catch(InvalidHoursException e)
        {
            System.out.print(e.getMessage());
            try {
                throw e;
            } catch (InvalidHoursException ex) {
                System.out.println("\nRe-thrown exception: " + ex.getMessage());
            }
        }
        finally{
            System.out.println("\nChecking of Hours Completed");
        }
    }
}
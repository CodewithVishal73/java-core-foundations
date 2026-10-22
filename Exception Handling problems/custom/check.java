class demo 
{
    void checkNumber(int n) throws AgeValidationException {
        if(n<18)
        {
            System.out.print("Valid");
        }
        else 
        {
            throw new AgeValidationException("Invalid Number");
        }
    }
}
class AgeValidationException extends Exception
{
    AgeValidationException(String msg)
    {
        super(msg);
    }
}
public class check 
{
    public static void main(String [] args)
    {
        demo d = new demo();
        try
        {
            d.checkNumber(19);
        }
        catch(AgeValidationException e)
        {
            System.out.print(e.getMessage());
        }
        finally{
            System.out.println("Checking of Number Completed");
        }
    }
}
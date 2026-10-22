class demo 
{
    void checkAge(int n) throws IneligibleVoterException{
        if(n<18)
        {
            System.out.print("Age is not eligible for voting");
        }
        else 
        {
            throw new IneligibleVoterException("Age is eligible for voting");
        }
    }
}
class IneligibleVoterException extends Exception
{
    IneligibleVoterException(String msg)
    {
        super(msg);
    }
}
public class VotingSystem
{
    public static void main(String [] args)
    {
        demo d = new demo();
        try
        {
            d.checkAge(16);
        }
        catch(IneligibleVoterException e)
        {
            System.out.print(e.getMessage());
        }
        finally{
            System.out.println("\nChecking of Age Completed");
        }
    }
}
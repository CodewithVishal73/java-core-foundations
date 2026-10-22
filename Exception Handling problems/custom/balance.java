class demo 
{
    void checkBalance(int bal) throws LowBalanceException {
        if(bal<1000)
        {
            System.out.print("Low balance");
        }
        else 
        {
            throw new LowBalanceException("valid Balance");
        }
    }
}
class LowBalanceException extends Exception
{
    LowBalanceException(String msg)
    {
        super(msg);
    }
}
public class balance 
{
    public static void main(String [] args)
    {
        demo d = new demo();
        try
        {
            d.checkBalance(1200);
        }
        catch(LowBalanceException e)
        {
            System.out.print(e.getMessage());
        }
        finally{
            System.out.println("\nchecking complete");
        }
    }
}
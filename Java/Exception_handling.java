package com.lab.JP.Exp4;

class InvalidProductException extends Exception
{
    public InvalidProductException(String s)
    {
        super(s);
    }
}

public class MyException
{
    void productCheck(int weight, int vol) throws InvalidProductException{
        if(weight<100 || vol<81){
            throw new InvalidProductException("Product Invalid");
        }
    }

    public static void main(String args[])
    {
        MyException obj = new MyException();
        try
        {
            obj.productCheck(60,84);
        }
        catch (InvalidProductException ex)
        {
            System.out.println("Caught the exception");
            System.out.println(ex.getMessage());
        }
    }
}

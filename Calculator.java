public class Calculator
{
    public static void main(String[] args)
    {
        System.out.println("Subtraction: "+subtraction(4,6));
        System.out.println("Multiplication: "+multiply(5,6));
    }

    public static int subtraction(int a,int b)
    {
        return a-b;
    }

    public static int multiply(int a,int b)
    {
        return a*b;
    }
}
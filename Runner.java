
public class Runner 
{
    public static void main(String[] args)
    {
        Fraction myFraction = new Fraction(2,3);
        Fraction otherFraction = new Fraction();
        Fraction newObj = myFraction;
        System.out.println(myFraction);
        System.out.println(otherFraction);
        System.out.println(newObj);
    }
}

// Lab04avst.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.


public class Lab04avst
{
    public static void main(String[] args)
    {
        System.out.println("Lab04a, Student Version\n");

        double principal  = 250000;
        double annualRate = 4.85;
        double numYears   = 30;

        double mothlyRate = (annualRate/100) / 12;
        double nummoths = numYears * 12;

        double numerator = mothlyRate * Math.pow(1+mothlyRate,nummoths);
        double denominator = Math.pow(1+mothlyRate,nummoths)-1;


        double mothlypayment =(numerator/denominator)*250000;





        System.out.println("Principal:            $" + principal);
        System.out.println("Annual Rate:          " + annualRate + "%");
        System.out.println("Number of Years:      " + numYears);

        System.out.println("Monthly Payment:      $" + mothlypayment);

    }
}
import java.text.DecimalFormat;
import java.util.Scanner;

public class FutureInterestBreakdown {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		//Initialize variables and take the input of the variables with the scanner
		System.out.print("Enter The investment amount: ");
		double investmentAmount = input.nextDouble();
		System.out.print("Enter the annual interest rate: ");
		double annualInterestRate = input.nextDouble();
		double monthlyInterestRate = ((annualInterestRate / 1200));
		     
        System.out.println("Investment Amount: " + investmentAmount);
        System.out.println("Annual interest rate: " + annualInterestRate + "%");
        System.out.println("Years           Future Investment Value");    
        System.out.println("---------------------------------------");    
        
        
        //Loop to display the breakdown of the interest 
        for (int years = 1; years < 31; years++)
        {
        	
        	System.out.println(years + "               " + df.format(futureInvestmentValue(
            investmentAmount, monthlyInterestRate, years)));
        } 
	
	}
          
//Method for calculating the interest 
public static double futureInvestmentValue
(double investmentAmount,double monthlyInterestRate, int years) 
	{
    double YearlyInterest = (investmentAmount * (Math.pow(1 +
            monthlyInterestRate, years * 12)));
    
    return (YearlyInterest);
	}

}
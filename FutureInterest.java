import java.text.DecimalFormat;
import java.util.Scanner;


public class FutureInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


Scanner input= new Scanner(System.in);
DecimalFormat df = new DecimalFormat("0.00");				
		

		//Initialize variables 
		int 	investmentAmount,
				numberOfYears;
		
		double  annualInterestRate,
				monthlyInterestRate,
				calculatedRate,
				numberOfMonths;
					
				//Take the input of the variables with the scanner
                System.out.println("Please Enter the Investment Amount? ");
                investmentAmount = input.nextInt();
		
                System.out.println("Please Enter annual interest rate? ");
                annualInterestRate = input.nextDouble();
		
                System.out.println("Please Enter the number of years investing? ");
                numberOfYears = input.nextInt();
                          
                //Calculates the future interest 
                calculatedRate = annualInterestRate / 100;
                monthlyInterestRate = calculatedRate / 12;
                numberOfMonths = numberOfYears*12;
                
                double futureInvestmentValue= investmentAmount*Math.pow((1+monthlyInterestRate), numberOfMonths);
                
                //Displays the future interest
                System.out.println("Your future investment value is "+ (df.format(futureInvestmentValue)) +"");                
                
	}
}
                
                
                
                
                
	
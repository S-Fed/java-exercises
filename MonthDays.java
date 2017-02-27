import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MonthDays {

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

//Prompt to enter the month and scanner to input the number 
System.out.print("Enter a month in the year (ex. 1 for Jan) :");
int month = input.nextInt();

//Prompt to enter the year and scanner to input the number 
System.out.print("Enter a year :");
int year = input.nextInt();

GregorianCalendar cal = new GregorianCalendar(year, month, 1);

//Shows the maximum number of days in the month entered
int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

System.out.print(month+"/"+year+" has "+days+" days");

String j = Integer.toString(days);







}

}
import java.io.*;
import java.util.Random;

public class BinaryRandomNumberFile {
  

public static void main(String[] args)
  	throws ClassNotFoundException, IOException{
	  //Creates random numbers
	  int[] randomNumbers = new int[10];
	  int   sum = 0;
	  Random random = new Random();
	  
	  
	  //Output the random numbers to a .txt file 
	  try(
			  ObjectOutputStream outdata = new ObjectOutputStream( new 
					  FileOutputStream("Exercise.txt"));
	     ){   for (int i = 0; i < randomNumbers.length; i++) {
	    	 randomNumbers[i] = random.nextInt((100) + 1);}		       
	     	 outdata.writeObject(randomNumbers);		 
	  	  }
	  
	  // Input the numbers from the same .txt file, display and add them together
	  try(
			  ObjectInputStream indata = new ObjectInputStream(new FileInputStream("Exercise.txt"));
		  ){
		  int [] readNumbers = (int[])(indata.readObject());
		  
		  for (int j = 0; j < readNumbers.length; j++)
		  System.out.print(readNumbers[j] + " ");
	  	  System.out.println();
		  
		  for( int i : readNumbers) 
			    sum += i;
			    System.out.print("The Sum is: " + sum);
			 	  
	  	   }
	  
  }
}

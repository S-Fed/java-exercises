import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

class Translator
{
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		String code = " ";
		String pepper = " ";
		
		//Initializing variables 
		Queue<String> queue = new LinkedList<String>();
		Queue<String> queue2 = new LinkedList<String>();
		int jalapeno = 0;
		int habanero = 0;
		int poblano = 0;
		int circuitCount = 0;
		
		//Starting the translator
		System.out.print(" > ");
		while(input.hasNext() && !code.equals("exit")) {
			
			System.out.print(" > ");
		
			code = input.nextLine();
			
			
				if(code.equals("exit")) {
					break;
				}
			String[] codePartsString = code.split(" ",2);
			String[] codeParts = code.split("\\s");
									
						//----- addition -----
						if(codeParts[0].equals("combine")) {
							  try {
						int combineResult = 0;
						combineResult =  Integer.parseInt(codeParts[1]) + Integer.parseInt(codeParts[2]);
						System.out.print("combine results: " + combineResult + "\n" + " > ");
							  } catch (NumberFormatException e) {
								  System.err.println("Input must be a Integer, " + e.getMessage());
								  System.out.print(" > ");
							  }
						}
						//------ Subtract ------			
						if(codeParts[0].equals("deduct")) {
							  try {
						int combineResult = 0;
						combineResult =  Integer.parseInt(codeParts[1]) - Integer.parseInt(codeParts[2]);
						System.out.print("deduct results: " + combineResult + "\n" + " > ");
							  } catch (NumberFormatException e) {
								  System.err.println("Input must be a Integer, " + e.getMessage());
								  System.out.print(" > ");
							  }
						}
						//----- Multiply -----
						if(codeParts[0].equals("amplify")) {
							  try {
						int combineResult = 0;
						combineResult =  Integer.parseInt(codeParts[1]) * Integer.parseInt(codeParts[2]);
						System.out.print("amplify results: " + combineResult + "\n" + " > ");
							  } catch (NumberFormatException e) {
								  System.err.println("Input must be a Integer, " + e.getMessage());
								  System.out.print(" > ");
							  }
						}
						//----- Divide -----
						if(codeParts[0].equals("partition")) {
							  try {
						int combineResult = 0;
						 try {
							 combineResult =  Integer.parseInt(codeParts[1])/Integer.parseInt(codeParts[2]);
						   
						
						System.out.print("partition results: " + combineResult + "\n" + " > ");
						 } catch (ArithmeticException e) {
					    	 System.err.println("Cannot Divide by Zero "+ "\n");
					    	
					    	  
					    }
							  } catch (NumberFormatException e) {
								  System.err.println("Input must be a Integer, " + e.getMessage());
								  System.out.print(" > ");
							  }
						}
			
						
						//-----Assigning Variables-----
						if(codeParts[0].equals("jalapeno")) {
							jalapeno = Integer.parseInt(codeParts[1]);
							}
						else if(codeParts[0].equals("habanero")) {
							habanero = Integer.parseInt(codeParts[1]);
							}
						else if(codeParts[0].equals("poblano")) {
							poblano = Integer.parseInt(codeParts[1]);
							}
						
						
						//-----Displaying Assigned Variables
						if(codeParts[0].equals("view") && codeParts[1].equals("jalapeno")) {
							System.out.print(jalapeno+ "\n" + " > "); 
						}
						else if(codeParts[0].equals("view") && codeParts[1].equals("habanero")) {
							System.out.print(habanero+ "\n" + " > "); 
						}
						else if(codeParts[0].equals("view") && codeParts[1].equals("poblano")) {
							System.out.print(poblano + "\n" + " > "); 
						}
		
						//-----Incrementing Variables-----
						if(codeParts[0].equals("increase")&& codeParts[1].equals("jalapeno")) {
							jalapeno++;
							}
						else if(codeParts[0].equals("increase")&& codeParts[1].equals("habanero")) {
							habanero++;
							}
						else if(codeParts[0].equals("increase")&& codeParts[1].equals("poblano")) {
							poblano++;
							}
						
						//-----Decrementing Variables-----
						if(codeParts[0].equals("decrease")&& codeParts[1].equals("jalapeno")) {
							jalapeno--;
							}
						else if(codeParts[0].equals("decrease")&& codeParts[1].equals("habanero")) {
							habanero--;
							}
						else if(codeParts[0].equals("decrease")&& codeParts[1].equals("poblano")) {
							poblano--;
							}
						
						
						
						
						//-----String Variables-----
						if(codePartsString[0].equals("pepper")) {
							pepper = codePartsString[1];
						}
						
						if(codeParts[0].equals("view") && codeParts[1].equals("pepper")) {
							System.out.print(pepper + "\n" + " > "); 
						}
					
						
						//----- Starts the translator Loop-----
						while(input.hasNext() && codeParts[0].equals("circuit") && !code.equals("end circuit")) {
							circuitCount = Integer.parseInt(codeParts[1]); 
							
							 
							System.out.print(" > ");
							code = input.nextLine();
							if(code.equals("exit")) {
								break;
							}
						
						String[] codeParts2 = code.split("\\s");
						
						
					
												
								
								//-----Displaying Assigned Variables Loop
								if(codeParts2[0].equals("view") && codeParts2[1].equals("jalapeno")) {
									 for(Object e : queue) {
									        queue2.add((String) e);
									    }
								}
								else if(codeParts2[0].equals("view") && codeParts2[1].equals("habanero")) {
									for(Object e : queue) {
								        queue2.add((String) e);
								    }
								}
								else if(codeParts2[0].equals("view") && codeParts2[1].equals("poblano")) {
									for(Object e : queue) {
								        queue2.add((String) e);
								    }
								}
				
				
								//-----Incrementing Variables Loop-----
								if(codeParts2[0].equals("increase")&& codeParts2[1].equals("jalapeno")) {
									jalapeno++;
									for(int i=0;i<(circuitCount);i++){ 
									queue.add(String.valueOf(jalapeno++));
									
									}
									jalapeno--;
								}
								else if(codeParts2[0].equals("increase")&& codeParts2[1].equals("habanero")) {
									habanero++;
									for(int i=0;i<(circuitCount);i++){ 
										queue.add(String.valueOf(habanero++));
										}
									habanero--;
								}
								else if(codeParts2[0].equals("increase")&& codeParts2[1].equals("poblano")) {
									poblano++;
									for(int i=0;i<(circuitCount);i++){ 
										queue.add(String.valueOf(poblano++));
										}
									poblano--;
								}
								
								//-----Decrementing Variables Loop-----
								if(codeParts2[0].equals("decrease")&& codeParts2[1].equals("jalapeno")) {
									jalapeno--;
									for(int i=0;i<(circuitCount);i++){ 
										queue.add(String.valueOf(jalapeno--));
										}
									jalapeno++;
									}
								else if(codeParts2[0].equals("decrease")&& codeParts2[1].equals("habanero")) {
									habanero--;
									for(int i=0;i<(circuitCount);i++){ 
										queue.add(String.valueOf(habanero--));
										}
									habanero++;
								}		
								else if(codeParts2[0].equals("decrease")&& codeParts2[1].equals("poblano")) {
									poblano--;
									for(int i=0;i<(circuitCount);i++){ 
										queue.add(String.valueOf(poblano--));
										}
									poblano++;
								}
							
								//-----Ends the Loop----- 
								if(codeParts2[1].equals("circuit")) {
									for(int i=0;i<(circuitCount);i++){ 
										queue.poll();
									}
									if(queue2.isEmpty()){
										}else{
											System.out.println("circuit results: ");
											for(int i=0;i<(circuitCount);i++){ 
											System.out.println(" > " + queue2.poll());
											}
											
										}
									  System.out.print(" > ");
								}	
								
								
						}
						
			}
		
}
	
}

	
	
	
	
	


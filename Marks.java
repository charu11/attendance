import java.util.*;
class Marks{
	public static void main(String args[]){		
	Scanner input=new Scanner(System.in);
	System.out.println("Enter your marks:");
	int marks=input.nextInt();
	double avg= marks/10.0;
	System.out.println("Your average is:"+avg);	
	System.out.println("Enter your attendence:");
	int attendence=input.nextInt();
		if(avg>=50 & attendence>=80){
			
			System.out.print("You Are Eligible");
			}else{
				
				System.out.println("NOT Eligible");
				
				}
	
	
	}




}

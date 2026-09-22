package studentregistration;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter Email");
		
		String Email;
		Email=scanner.nextLine();
		// while loop  and if for password
		
		String password ="";
		
		while(password.length()!=8) {
			System.out.println("Enter Password");
			password= scanner.nextLine();
			
			if(password.length()!=8) {
				System.out.println("password must be exactly 8 characters, Try again");
			}else {
				System.out.println("Password correct");
			}
		}
		// do while and if 
		int choice;
		do {
			System.out.println("1.Register a new person");
			System.out.println("2 View registration Status");
			System.out.println("3.Exist");
			choice=scanner.nextInt();
			scanner.nextLine();
			
			
			if(choice==1) {
				System.out.println("Register Now");
				
			}else if(choice==2) {
				System.out.println("You are registered");
			}
			
			
			
			
			}while (choice==3); {
				System.out.println("Bye");
			}
			//student details
			System.out.println("Enter Your Full Name");
			String Name;
			Name=scanner.nextLine();
			System.out.println("Enter Programme");
			String Programme;
			Programme=scanner.nextLine();
			System.out.println("Year of study");
			int year;
			year=scanner.nextInt();
			System.out.println("Semister");
			int semister;
			semister=scanner.nextInt();
			
			
			
			// FOR LOOP
			for(int i =1; i<= semister; i++) {
				System.out.println("Semister" +i+"-"+Name+"-"+ Programme + "Year"+year);
			}
			
			//TERNARY
			String result = (semister >= 1) ? "Successfull" : "Not Successfull";
			System.out.println(result);
			
			scanner.close();
			
		
			
			
			
		
		
		
		

	}

	

}

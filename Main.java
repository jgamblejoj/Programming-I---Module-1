import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//Start
		
		//Declare variables
        String first_name;
		String last_name;
		String address;
		String city;
        int zip;
	
		//Initialize Scanner for user input
		Scanner scnr = new Scanner(System.in);
		
		//Print 'Enter First name'
		System.out.println("Enter your first name");
		//Assign input to first_name variable
		first_name = scnr.nextLine();	
		//Print 'Enter Last name'
		System.out.println("Enter your Last name");
		//Assign input to last_name variable
		last_name = scnr.nextLine();
		//Print 'Enter Street Address'
		System.out.println("Enter your Street Address");
		//Assign input to address variable
		address = scnr.nextLine();	
		//Print 'Enter City'
		System.out.println("Enter your City");	
		//Assign input to city variable
		city = scnr.nextLine();
		//Print 'Enter Zip code'
		System.out.println("Enter your Zip code");	
		//Assign input to zip variable
		zip = scnr.nextInt();
		
		//Use System.out.println to output variables onto the screen
		//first_name
		//last_name
		//address
		//city
		//zip
		System.out.println("Your first name is: " + first_name);
		System.out.println("Your last name is: " + last_name);
		System.out.println("Your address is: " + address);
		System.out.println("Your city is: " + city);
		System.out.println("Your zipcode is " + zip);
			
		//End

	}
}
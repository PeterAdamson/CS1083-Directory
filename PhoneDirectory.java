//Authors Peter Adamson, Tristen Tulkens

import java.util.TreeMap;
import java.util.Scanner;
import java.util.Map;

public class PhoneDirectory{

	private TreeMap<String, Person> tMap = new TreeMap<String, Person>();
	private Scanner sc = new Scanner(System.in);

	public PhoneDirectory(){
		try{
		
			int choice = 0;

			while(choice != 5){		
				System.out.println("Menu");
				System.out.println("-----");
				System.out.println("1. Add a person to the phone directory");
				System.out.println("2. Remove a person from the phone directory");
				System.out.println("3. search for a phone number in the phone directory");
				System.out.println("4. List all people in the phone directory");
				System.out.println("5. Exit");
				System.out.println();
				System.out.println("Enter your choice: ");
				choice = sc.nextInt();
				sc.nextLine();

				if(choice == 1){
					addPerson(sc);
				}

				else if(choice == 2){
					removePerson(sc);
				}

				else if(choice == 3){
					searchPhoneNumber(sc);
				}

				else if(choice == 4){
					displayAll();
				}
			}

		
		}
		catch(Exception exp){
			System.out.println("An exception was thrown!\n\n" + exp);
		}

	}

	public static void main(String[] args){
		new PhoneDirectory();
	}

	public void addPerson(Scanner sc){
		System.out.println("What is the person's name?");
		String name = sc.nextLine();
		System.out.println("What is the person's phone number?");
		String phoneNumber = sc.nextLine();
		System.out.println("What is the person's street name?");
		String streetName = sc.nextLine();
		System.out.println("What is the person's street number?");
		int streetNum = sc.nextInt();
		sc.nextLine();
		System.out.println("What is the person's unit number?");
		int unitNum = sc.nextInt();
		sc.nextLine();
		System.out.println("What is the person's postal code?");
		String postalCode = sc.nextLine();

		if(tMap.containsKey(phoneNumber)){
			System.out.println("The person you have entered is already in the directory");
			System.out.println();
		}
		else{
			tMap.put(phoneNumber, new Person(name, unitNum, streetNum, streetName, postalCode));
			System.out.println("The person was successfully added to the directory");
			System.out.println();
		}
	}

	public void removePerson(Scanner sc){
		System.out.println("please enter the phone number of the person you want to remove");
		String phoneNumber = sc.nextLine();
		if(tMap.remove(phoneNumber) != null){
			System.out.println("The person was successfully removed");
			System.out.println();
		}
		else{
			System.out.println("The person was not found in the directory");
			System.out.println();
		}
	}

	public void searchPhoneNumber(Scanner sc){
		System.out.println("Please enter the phone number of the person you want to find");
		String phoneNumber = sc.nextLine();
		if(tMap.containsKey(phoneNumber)){
			System.out.printf("Phone Number \t Name \t\t Address%n");
			System.out.println("----------------------------------------------------------");
			System.out.printf("%s \t %s%n", phoneNumber, tMap.get(phoneNumber).toString());
			System.out.println();
		}
		else{
			System.out.println("The person was not found");
			System.out.println();
		}
	}

	public void displayAll(){
		System.out.printf("Phone Number \t Name \t\t Address%n");
		System.out.println("----------------------------------------------------------");
		for(Map.Entry<String, Person> entry: tMap.entrySet()){
			System.out.printf("%s \t %s%n", entry.getKey(), entry.getValue().toString());
		}
		System.out.println();
	}
}

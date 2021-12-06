package carRentalSystem;
import java.util.*;

public class Main {

	public static void print(){
        String functions="1. Add a car\n" +
                "2. Add a customer(Register)\n" +
                "3. Rent a car\n" +
                "4. Return a car\n" +
                "5. Check rentalbook\n" +
                "6. Check carlist\n" +
                "7. Check customer list\n"+
				"8. Delete a car\n"+
				"9. Delete a customer\n"+
                "10. To end the service";
        System.out.println(functions);
    }

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		Scanner scan = new Scanner(System.in);
		rentalSystem currentSystem = new rentalSystem();
		while(true){
			// the while loop that allows the user to continuely apply functions, until they choose to end
			// the service
			
			print();
			System.out.print("\nPlease select the service that you want to conduct:\n");
			int choice = scan.nextInt();

			System.out.println("\n");
			if (choice==1){
				System.out.print("\nPlease enter the car's information:\n");
				System.out.print("\nCarid:\n");
				String carid = scan.next();
				System.out.print("\nCarname:\n");
				String carname = scan.next();
				System.out.print("\nType:\n");
				String type = scan.next();
				System.out.print("\nLevel:\n");
				String level = scan.next();
				System.out.print("\nColor:\n");
				String color = scan.next();
				System.out.print("\nInsurance:\n");
				String insurance = scan.next();
				System.out.print("\nPrice:\n");
				String price = scan.next();
				car newcar = new car(carid, carname, type, level, color, insurance, price);
				currentSystem.addCar(newcar);
				System.out.print(carid + " " + carname + " is successfully added to the carlist\n");
			}
			if (choice==2){
				System.out.print("\nPlease enter the user's information:\n");
				System.out.print("\nName:\n");
				String name = scan.next();
				System.out.print("\nPhone Number:\n");
				String phoneNumber = scan.next();
				System.out.print("Set your personal ID:");
				String id = scan.next();
				System.out.print("Now please enter your payment information:\n");
				System.out.print("\nBank Name:\n");
				String bankName = scan.next();
				System.out.print("\nAccount Number:\n");
				String accnum = scan.next();
				System.out.print("\nAccount Type:\n");
				String acctype = scan.next();
				String[] paymentInfo = new String[]{bankName,accnum,acctype};
				customer newcustomer = new customer(name, phoneNumber, id, paymentInfo);
				currentSystem.addCustomer(newcustomer);
				System.out.print(newcustomer.getId() + " " + name + " is successfully added to the customer list\n");
				System.out.println();


			}
			if (choice==3){
				System.out.print("\nPlease enter the user's ID:\n");
				String id = scan.next();
				System.out.print("\nPlease enter the car you want to rent:\n");
				String carname = scan.next();
				currentSystem.rentACar(id, carname);
			}
			if (choice==4){
				System.out.print("\nPlease enter the user's ID:\n");
				String id = scan.next();
				System.out.print("\nPlease enter the car you want to return:\n");
				String carname = scan.next();
				System.out.print("\nPlease enter the return date:\n");
				String returndate = scan.next();
				currentSystem.returnCar(id, carname, returndate);
				currentSystem.records.printRevenue();
			}
			if (choice==5){
				currentSystem.rentalBook.printRentalBook();
			}
			if (choice==6){
				currentSystem.printCarList();
				System.out.println();
			}
			if (choice==7){
				currentSystem.printCustomerList();
				System.out.println();
			}
			if (choice==8){
				System.out.println("Please enter the car ID:");
				String id = scan.next();
				currentSystem.delCar(id);
			}
			if (choice==9){
				System.out.println("Please enter the User ID:");
				String id = scan.next();
				currentSystem.delCustomer(id);
			}
			else if(choice==10){
				System.out.println("Now the service will shut off");
				break;
			}
			
			
			System.out.println("\nPlease make another choice\n");
		}
		System.out.println("System stopped.");
		scan.close(); 
	}

}

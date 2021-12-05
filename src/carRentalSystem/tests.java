package carRentalSystem;

public class tests{
	  public static void main(String[] args) {
	      String[] paymentInfo1 = new String[]{"BoA","22222","checking"};
	      String[] paymentInfo2 = new String[]{"BoA","11111","checking"};
	      customer customer1 = new customer("Haowei","8570001111","111", paymentInfo1);
	      customer customer2 = new customer("David","8571112222","222", paymentInfo2);
	      car car1 = new car("001","Mercedes","S550","Luxury","Black","Liberty","$1000");
	      car car2 = new car("002","Honda","S550","Luxury","Black","Liberty","$1000");
	      car car3 = new car("003","Toyota","S550","Luxury","Black","Liberty","$1000");
	      car car4 = new car("004","Jeep","S550","Luxury","Black","Liberty","$1000");
	      rentalSystem currentSystem = new rentalSystem();
	      currentSystem.addCustomer(customer1);
	      String Haowei = customer1.getId();
	      String David = "222";
		  System.out.println(Haowei);
	      currentSystem.addCustomer(customer2);
	      currentSystem.addCar(car1);
	      currentSystem.addCar(car2);
	      currentSystem.addCar(car3);
	      currentSystem.addCar(car4);
	      System.out.println("Current RentalBook: ");
	      currentSystem.rentalBook.printRentalBook();
	      currentSystem.printCarList();
	      currentSystem.printCustomerList();
	      currentSystem.rentACar("111", "Mercedes");
	      currentSystem.rentACar(David, "Mercedes");
	      currentSystem.rentACar(David, "Jeep");
	      System.out.println("Current RentalBook: ");
	      currentSystem.rentalBook.printRentalBook();
	      currentSystem.returnCar(Haowei, "Mercedes", "01/21/2021");
	      currentSystem.records.printRevenue();
	      System.out.println("Current RentalBook: ");
	      currentSystem.rentalBook.printRentalBook();
	      currentSystem.rentACar(David, "Mercedes");
	      System.out.println("Current RentalBook: ");
	      currentSystem.rentalBook.printRentalBook();
	    }
	}
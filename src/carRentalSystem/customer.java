package carRentalSystem;

import java.util.Arrays;
import java.util.Random;

public class customer {
	private String name;
	private String id;
	private String phoneNumber;
	private String[] paymentInfo;
	/**
	 * This method gets the name of the customer
	 * @return name of the customer
	 */
	public final String getName(){
		return name;
	}
	/**
	 * set the name of the current customer object
	 * @param name
	 * @throws IllegalArgumentException
	 */
	public final void setName(String name) throws IllegalArgumentException{
		if(name==null || name.length() == 0)
			throw new IllegalArgumentException("Name can not be NULL or length equals 0");
		this.name = name;
	}
	/**
	 * This method returns the unique ID of the customer
	 * @return ID
	 */
	public final String getId(){
		return id;
	}

	public final String getNamebyid(String id){

		return id;
	}
	/**
	 * This method randomly generates 3 digits id and sets the id for the customer
	 * @param id
	 * @throws IllegalArgumentException
	 */
	public final void setrandId() throws IllegalArgumentException{
		Random  rand = new Random();
		int r1 = rand.nextInt(10);
		int r2 = rand.nextInt(10);
		int r3 = rand.nextInt(10);
		this.id = "" +r1+r2+r3;
	}
	public final void setId(String id) throws IllegalArgumentException{
		if(id==null || id.length() == 0)
			throw new IllegalArgumentException("Name can not be NULL or length equals 0");
		this.id = id;
	}
	/**
	 * This method returns a phone number of the customer
	 * @return phoneNumber
	 */
	public final String getPhoneNumber(){
		return phoneNumber;
	}
	/**
	 * This method sets a phone number for the customer object
	 * @param phoneNumber
	 * @throws IllegalArgumentException
	 */
	public final void setPhoneNumber(String phoneNumber) throws IllegalArgumentException{
		if(phoneNumber==null || phoneNumber.length() == 0)
			throw new IllegalArgumentException("phoneNumber can not be NULL or length equals 0");
		this.phoneNumber = phoneNumber;
	}
	/**
	 * This method returns the customer payment information
	 * @return paymentInfo
	 */
	public final String[] getPaymentInfo(){
		return paymentInfo;
	}
	/**
	 * This methods sets a payment information for the customer
	 * @param paymentInfo
	 * @throws IllegalArgumentException
	 */
	public final void setPaymentInfo(String[] paymentInfo) throws IllegalArgumentException{
		if(paymentInfo==null || paymentInfo.length == 0)
			throw new IllegalArgumentException("phoneNumber can not be NULL or length equals 0");
		this.paymentInfo = paymentInfo;
	}
	/**
	 * This creates an empty customer object, and it needs to be added information
	 */
	public customer() {
		
	}
	/**
	 * This is the official constructor for a customer object
	 * @param name
	 * @param id
	 * @param phoneNumber
	 * @param paymentInfo
	 */
	public customer(String name, String phoneNumber, String id, String[] paymentInfo) {
		setName(name);
		setId(id);
		setPhoneNumber(phoneNumber);
		setPaymentInfo(paymentInfo);
	}
	/**
	 * This main function tests the class to see if it works
	 */
	public void main() {
		
		paymentInfo = new String[]{"BoA","12345","checking"};
		customer customer1 = new customer("Haowei","10800", "123", paymentInfo);
		System.out.println(customer1.getName());
		System.out.println(customer1.getId());
		System.out.println(customer1.getPhoneNumber());
		System.out.println(Arrays.toString(customer1.getPaymentInfo()));
	}
}
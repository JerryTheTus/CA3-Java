import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Customer {
  private int customerID;
  private String customerName;
  private String customerAddress;
  public Customer (int customerID, String customerName, String customerAddress){
    this.customerID = customerID;
    this.customerName = customerName;
    this.customerAddress = customerAddress;
  }
  public void setCustomerID (int customerID){
    this.customerID = customerID;
  }
  public int getCustomerID (){
    return customerID;
  }
  public void setCustomerName(String customerName){
    this.customerName = customerName;
  }
  public String getCustomerName(){
    return customerName;
  }
  public void setCustomerAddress(String customerAddress){
    this.customerAddress = customerAddress;
  }
  public String getCustomerAddress(){
    return customerAddress;
  }
  public void CustomerMenu (Scanner input) {
    while (true) {
      System.out.println("\n***Customer Menu***\n1. Add Customer\n2. Edit Customer\n3. Remove Customer\n4. View all Customers\n5. Back to the Main menu\n");
      System.out.print("Enter option: ");
      int cake = input.nextInt();
      switch (cake) {
      case 1:
        System.out.print("Enter Customer ID: ");
        int customerID = input.nextInt();
        input.nextLine();
        System.out.print("\nEnter Customer full name: ");
        String customerName = input.nextLine();
        System.out.print("\nEnter Customer contact number: ");
        int customerContact = input.nextInt();
        input.nextLine();
        System.out.print("\nEnter Customer Address: ");
        String customerAddress = input.nextLine();
        break;
      case 2:
        System.out.println("Enter Customer's ID to edit: ");
        int editID = input.nextInt();
        break;
      case 3:
        System.out.println("Enter Customer's ID to remove: ");
        int removeID = input.nextInt();        
        break;
      case 4:
        System.out.println("Viewing all customers");
        break;
      case 5:
        System.out.println();
        return;
      default:
        System.out.println("Invalid option");
        return;
      }
    }
  }
}

import java.util.Scanner;
public class project{
  public static void main (String[] args){
    Customer b = new Customer(0, null, "a");
    Cake a = new Cake(0, null, 0);
    Order c = new Order();
    Report d = new Report();
    Scanner input = new Scanner(System.in); 
    while (true) {
      System.out.print("***Main Menu***\n1. Manage Cakes\n2. Manage Customers\n3. Manage Orders\n4. Generate Report\n0. Exit\n"); 
      System.out.print("Enter option: ");
      int option = input.nextInt();
      switch (option) {
      case 0:
        input.close();
        System.out.println("You have exited");
        return;
      case 1:
        a.CakeMenu(input);
        
        break;
      case 2:
        
        b.CustomerMenu(input);
        
        break;
      case 3:
        c.OrderCustomer(input);
         
        break;
      case 4:
        d.GenerateReport(input);
        
        break;
      default:
        System.out.println("Invalid input");
        return;
      }
    }
  } 
}


import java.util.Scanner;

public class Report {
  public void GenerateReport (Scanner input) {
  while (true) {    
    System.out.println("\n***Report Menu***\n1. Generate Orders report by Date \n2. Generate Orders report by Cake\n3. Generate Orders report by Customer\n4. Generate total number of Orders \n5. Back to the Main menu\n");
    System.out.print("Enter option: ");
    int cake = input.nextInt();
    switch (cake) {
      case 1:
        System.out.println();
        break;
      case 2:
        System.out.print("Enter Cake code: ");
        int cakeCode = input.nextInt();
        break;
        case 3:
        System.out.println();
        break;
      case 4:
        System.out.printf("Total number of Orders: ");
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

import java.util.Scanner;

public class Cake {
  private int cakeCode;
  private String cakeName;
  private double cakePrice;
  public Cake(int cakeCode, String cakeName, double cakePrice){
    this.cakeCode = cakeCode;
    this.cakeName = cakeName;
    this.cakePrice = cakePrice;
  }
  public void setCakeCode(int cakeCode){
    this.cakeCode = cakeCode;
    }
  public void setCakeName(String cakeName){
    this.cakeName = cakeName;
  }
  public void setCakePrice(double cakePrice){
    this.cakePrice = cakePrice;
  }
  public int getCakeCode(){
    return cakeCode;
  }
  public String getCakeName(){
    return cakeName;
  }
  public double getCakePrice(){
    return cakePrice;
  }
  public void CakeMenu (Scanner input) {
  while (true) {
    System.out.println("\n***Cake Menu***\n1. Create Cake\n2. Update Cake\n3. Delete Cake\n4. View all Cakes\n5. Back to the Main Menu\n");
    System.out.print("Enter option: ");
    int cake = input.nextInt();
    switch (cake) {
      case 1:
        System.out.println("Enter Cake Name: ");
        String newCakeName = input.nextLine();
        input.nextLine();
        System.out.println("Enter Cake Code: ");
        int newCakeCode = input.nextInt();
        System.out.println("Enter Cake Price: ");
        double newCakePrice = input.nextDouble();
        input.nextLine();
        break;
      case 2:
        System.out.println("Enter Cake Code to update: ");
        int updateCakeCode = input.nextInt();
        input.nextLine();
        break;
      case 3:
        System.out.println("Enter Cake Code to delete: ");
        int deleteCakeCode = input.nextInt();
        input.nextLine();
        break;
      case 4:
        System.out.println(cake);
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

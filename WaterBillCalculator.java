import java.util.Scanner;
public class WaterBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter water consumption in litres: ");
        double consumption = scanner.nextDouble();

        double billAmount;

        if (consumption <= 500) {
            billAmount = 100.0;
        } else {
            billAmount = 200.0;
        }
        System.out.println("The total water bill is: Rs. " + billAmount);

        scanner.close();
    }
}
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Carly’s makes the food that makes it a party");
        System.out.println("Introduceti cati invitati vor fi:");
        Scanner sc = new Scanner(System.in);
        int guests = sc.nextInt();
        int prices = 35;
        double eventprice;
        eventprice = 35 * guests;
        System.out.println("Pretul per invitat este:" + prices);
        System.out.println("Pretul total este:" + eventprice);
        if (guests >= 50) {
            System.out.println("True");
        } else {
            System.out.println("Fals");
        }
    }
}
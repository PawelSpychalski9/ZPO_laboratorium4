import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShopPurchase purchase = new ShopPurchase();

        CustomProduct pendrive = new CustomProduct("Pendrive", 39.99);
        purchase.addProduct(pendrive);

        CustomProduct microwave = new CustomProduct("Mikrofala", 109.99);
        purchase.addProduct(microwave);

        System.out.println("1. Smycz do pendrive");
        System.out.println("2. Maskotka");
        System.out.println("3. Rabat");
        System.out.println("4. Dostawa zamówienia");
        System.out.println("0. zakończ i przejdź do podsumowania");

        int choice;
        do {
            System.out.print("Wybierz opcje od 1 do 4 lub zakończ wpisując 0:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    purchase.addProduct(new ShopMascot());
                    break;
                case 2:
                    purchase.addProduct(new PendriveLanyard());
                    break;
                case 3:
                    purchase.addProduct(new Discount(10));
                    break;
                case 4:
                    purchase.addProduct(new ShippingCost(13));
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Niepoprawny wybór. Wybierz liczbę od 0 do 4.");
            }
        } while (choice != 0);

        purchase.displayPurchaseDetails();
    }
}

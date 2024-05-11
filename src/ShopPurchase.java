import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class ShopPurchase {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return Math.max(totalPrice, 0); // Cena nie może być ujemna
    }

    public void displayPurchaseDetails() {
        System.out.println("Zakupione produkty:");
        for (Product product : products) {
            System.out.println("- " + product.getDescription());
        }
        System.out.println("Łączna cena: " + calculateTotalPrice() + " PLN");
    }
}
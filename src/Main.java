public class Main {
    public static void main(String[] args) {
        Pizza basicPizza = new BasicPizza();

        //Aby pominąć składnik bo należy do eoferty podstawowej należy zmienić wartość true na false
        Pizza pizzaWithCheese = new CheeseDecorator(basicPizza, true);
        Pizza pizzaWithMushrooms = new MushroomDecorator(basicPizza, true);
        Pizza deluxePizza = new CheeseDecorator(new MushroomDecorator(new BasicPizza(), true), true);

        PizzaOrder order1 = new PizzaOrder(pizzaWithCheese);
        PizzaOrder order2 = new PizzaOrder(pizzaWithMushrooms);
        PizzaOrder order3 = new PizzaOrder(deluxePizza);


        order1.printOrderDetails();
        System.out.println();
        order2.printOrderDetails();
        System.out.println();
        order3.printOrderDetails();
    }
}
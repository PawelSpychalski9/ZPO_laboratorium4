class PizzaOrder {
    private Pizza pizza;

    public PizzaOrder(Pizza pizza) {
        this.pizza = pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public void printOrderDetails() {
        System.out.println("Zamówienie: " + pizza.getDescription());
        System.out.println("Cena: " + pizza.getPrice() + " PLN");
    }
}
class CheeseDecorator extends PizzaDecorator {
    private boolean includeCheese;

    public CheeseDecorator(Pizza pizza, boolean includeCheese) {
        super(pizza);
        this.includeCheese = includeCheese;
    }

    @Override
    public String getDescription() {
        if (includeCheese) {
            return pizza.getDescription() + ", Ser";
        } else {
            return pizza.getDescription();
        }
    }

    @Override
    public double getPrice() {
        if (includeCheese) {
            return pizza.getPrice() + 2.0;
        } else {
            return pizza.getPrice();
        }
    }
}
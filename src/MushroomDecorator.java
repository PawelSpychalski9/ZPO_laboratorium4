class MushroomDecorator extends PizzaDecorator {
    private boolean includeMushrooms;

    public MushroomDecorator(Pizza pizza, boolean includeMushrooms) {
        super(pizza);
        this.includeMushrooms = includeMushrooms;
    }

    @Override
    public String getDescription() {
        if (includeMushrooms) {
            return pizza.getDescription() + ", Pieczarki";
        } else {
            return pizza.getDescription();
        }
    }

    @Override
    public double getPrice() {
        if (includeMushrooms) {
            return pizza.getPrice() + 1.5;
        } else {
            return pizza.getPrice();
        }
    }
}
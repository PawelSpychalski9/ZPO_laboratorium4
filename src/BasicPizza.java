class BasicPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Podstawowa pizza";
    }

    @Override
    public double getPrice() {
        return 10.0;
    }
}
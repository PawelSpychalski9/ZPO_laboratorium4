class ShippingCost implements Product {
    private double cost;

    public ShippingCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String getDescription() {
        return "Koszt transportu";
    }

    @Override
    public double getPrice() {
        return cost;
    }
}
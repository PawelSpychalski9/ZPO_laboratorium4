class CustomProduct implements Product {
    private String name;
    private double price;

    public CustomProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

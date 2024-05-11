class Discount implements Product {
    private double discountAmount;

    public Discount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public String getDescription() {
        return "Rabat w wysokości " + discountAmount + " PLN";
    }

    @Override
    public double getPrice() {
        return -discountAmount;
    }
}
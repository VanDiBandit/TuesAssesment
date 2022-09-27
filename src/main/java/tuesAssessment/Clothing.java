package tuesAssessment;

public class Clothing {
    private String description;
    private double price;
    private char size;

    Customer customer;

    public Clothing(String description, double price, char size){
        super();
        this.description = description;
        this.price = price;
        this.size = size;
        this.customer = customer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "description='" + description + '\'' +
                '}';
    }
}

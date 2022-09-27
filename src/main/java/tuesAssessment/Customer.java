package tuesAssessment;

public abstract class Customer extends Person {
    private char size;
    private String clothing;

    private String name;

    public Customer(char size, String clothing, String name) {
        super(size, clothing, name);
        this.size = size;
        this.clothing = clothing;
        this.name = name;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "clothing='" + clothing + '\'' +
                '}';
    }
}
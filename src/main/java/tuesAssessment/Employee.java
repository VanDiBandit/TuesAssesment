package tuesAssessment;

public abstract class Employee extends Customer{
    private final double discount = 0.10;
    public String name;

    public Employee(char size, String clothing, String name) {
        super(size, clothing, name);
        this.name = name;

    }

    public double getDiscount() {
        return discount;
    }
    public abstract void printEmpPriceAfterDisc(Clothing x);
}

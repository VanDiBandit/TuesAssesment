package tuesAssessment;

public class hourlyEmployee extends Employee implements Discountable{
    public double discount;
    public String name;

    public hourlyEmployee(char size, String clothing, String name) {
        super(size, clothing, name);
        this.discount = discount;
        this.name = name;
    }

    @Override
    public String toString() {
        return "hourlyEmployee{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void printEmpPriceAfterDisc(Clothing x) {

    }

    @Override
    public double calcDiscount(Clothing x) {
        return 0;
    }

    @Override
    public double calcDiscount() {
        return 0;
    }
}

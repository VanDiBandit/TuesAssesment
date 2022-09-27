package tuesAssessment;

public class Manager extends Employee implements Discountable{
    public double discount = 0.25;
    public String name;

    public Manager(char size, String clothing, String name) {
        super(size, clothing, name);
        this.discount = discount;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
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

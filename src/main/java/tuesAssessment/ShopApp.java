package tuesAssessment;

//import java.util.ArrayList;

public class ShopApp {

    public static double calcTotal(Clothing clothing) {
        return clothing.getPrice();
        //loop through each item for each item
        //loop through items & price
        //final total for each item added together
    }

//    public static boolean isAFit(Customer, Clothing x) {
//        return false;
//    }
//
//    public static void sortAndPrintClothingByPrice(ArrayList<Clothing>) {
//
//    }
//
//    public static void printEmployeeName(Employee) {
//
//    }
//
//    public static void printDiscAmtOff(Discountable[], Clothing x) {
//
//    }

    public static void main(String[] args) {


        Clothing mShirt = new Clothing("Gucci Button Down", 300.00, 'S');
        Clothing mJeans = new Clothing("Balmain Jeans", 500.00, 'M');
        Clothing mJacket = new Clothing("Louie Vuitton Jacket", 1500.00, 'L');

        Clothing[] managerCart = {mShirt, mJeans, mJacket};
        for (int m = 0; m < managerCart.length; m++){
            System.out.println(managerCart[m]);
        }

        Clothing eShirt = new Clothing("Goodwill Shirt", 5.00, 'S');
        Clothing eJeans = new Clothing("Walmart Cargos", 40.00, 'L');
        Clothing eJacket = new Clothing("Helly Hansen Puffer", 500.00, 'M');

        Clothing[] employeeCart = {eShirt, eJeans, eJacket};
        for (int e = 0; e < employeeCart.length; e++) {
            System.out.println(employeeCart[e]);
        }
    }
}

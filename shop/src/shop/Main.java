package shop;

import java.util.GregorianCalendar;

/**
 * Created by elizavetaskomorohova on 19.02.18.
 */
public class Main {
    public static void main(String[] args) {

        Product[] products;
        products = new Product[]{
                new Product("egg", new GregorianCalendar(2018, 11, 10)),
                new Product("milk", new GregorianCalendar(2018, 06, 10)),
                new Product("curd", new GregorianCalendar(2018, 12, 10)),
        };
        Shop myShop = new Shop("Magnit", products);
        myShop.printName();
        myShop.printListOfProducts();
        myShop.bueItem(products);
        myShop.printShoppingCard();
    }

}

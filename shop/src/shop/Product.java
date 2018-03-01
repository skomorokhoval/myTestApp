package shop;

import java.util.GregorianCalendar;

/**
 * Created by elizavetaskomorohova on 21.02.18.
 */
public class Product {
    public String name;
    public GregorianCalendar expiration_date;


    public Product(String _name, GregorianCalendar exp) {
        name = _name;
        expiration_date = exp;
    }


}

package shop;

import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * Created by elizavetaskomorohova on 21.02.18.
 */
public class Shop {
    public String shopName;
    public Product[] listOfProducts;
    public Product[] shoppingCart;


    public Shop(String name, Product[] l) {
        shopName = name;
        listOfProducts = l;
        shoppingCart = new Product[1];
    }

    public void addProductsToShop() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите наименование товара и сроки годности в формате dd-MMM-yyyydd-MMM-yyyy: ");
        while (product.nextLine){

        }
    }

    public void printListOfProducts() {
        int size = listOfProducts.length;
        System.out.println("the following products exist ");
        for (int i = 0; i < size; i++) {
            System.out.println(listOfProducts[i].name);
            SimpleDateFormat fmt = new SimpleDateFormat("dd-MMM-yyyy");
            String dateFormatted = fmt.format(listOfProducts[i].expiration_date.getTime());
            System.out.println(dateFormatted);

        }
    }

    public void printName() {
        System.out.print("shop name is ");
        System.out.println(shopName);
    }

    public void bueItem(Product[] listOfProducts) {
        int size = listOfProducts.length;
        for (int i = 0; i < size; i++) {
            if (listOfProducts[i].name == "egg") {
                shoppingCart[i] = listOfProducts[i];
                break;

            } else {
                System.out.print("no match! ");
            }
        }

    }


    public void printShoppingCard() {
        System.out.print("shopping card contains ");
        int size = shoppingCart.length;
        for (int i = 0; i < size; i++) {
            System.out.println(shoppingCart[i].name);


        }
    }
}

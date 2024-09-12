
package Prods;

import java.util.ArrayList;
import java.util.List;

public class Prods {
    private final List<Product> products;

    public Prods() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayProducts() {
        for (Product product : products) {
            product.displayProduct();
            System.out.println(); 
        }
    }
}    


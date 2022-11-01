package Collections;

import java.util.HashSet;
import java.util.Set;

public class BuyProducts {
    Set<String> products = new HashSet<>();
    public void addProduct(String product){
        products.add(product);
    }
    public void showAllProducts(){
        for(String string : products){
            System.out.println(string);
        }
    }

}

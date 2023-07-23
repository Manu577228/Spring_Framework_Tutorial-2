package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkout(String status) {
        // Logging
        // Authentication & Authorization
        // Sanitize the data
        System.out.println("Check out method from Shopping-cart called");
    }

    public int quantity() {
        return 2;
    }
}

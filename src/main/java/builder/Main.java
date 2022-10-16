package builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setDescription("test description");
        product.setName("test name");

        Product product2 = new Product.Builder()
                .id("2")
                .name("test")
                .createDate(LocalDateTime.now())
                .description("test")
                .inStock(true)
                .amount(BigDecimal.valueOf(10000))
                .build();

        System.out.println(product2);
    }
}

package lombok_examples;

import lombok.Value;

/**
 * @author Evgeny Borisov
 */
@Value
public final class Product {

    private final String name;
    private final int price;
    private final int discount;


    public Product withName(String name) {
        return this.name == name ? this : new Product(name, this.price, this.discount);
    }

    public Product withPrice(int price) {
        return this.price == price ? this : new Product(this.name, price, this.discount);
    }

    public Product withDiscount(int discount) {
        return this.discount == discount ? this : new Product(this.name, this.price, discount);
    }
}

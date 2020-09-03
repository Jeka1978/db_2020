package lombok_examples;

import java.util.Map;

/**
 * @author Evgeny Borisov
 */
public class Main {


    public static void main(String[] args) {

        Product product = new Product("pink floyd animals", 100, 0);
        Product product1 = product.withPrice(200);
        System.out.println("product = " + product);
        System.out.println("product1 = " + product1);


        Human human = Human.builder()
                .age(32)
                .name("Vasya")
                .beer("Tuborg",2)
                .beer("Nevskoe",4)
                .beer("Baltika",5)
                .salary(2000)
                .child("Petya")
                .однаРыба("карп")
                .однаРыба("щука")
                .build();
        System.out.println("human = " + human);
    }
}

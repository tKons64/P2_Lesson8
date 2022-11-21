import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


    // Урок 7. Домашние задания
        System.out.println();
        System.out.println("Урок 7. Домашнее задание №1");

        Product apples = new Product("Яблоки", 99, 2);
        Product tomatoes = new Product("Помидоры", 100, 1);
        Product bananas = new Product("Бананы", 60, 1);
        Product apples2 = new Product("Яблоки", 99, 2);

        Set<Product> listOfProducts = new HashSet<>();
        addProduct(listOfProducts, apples);
        addProduct(listOfProducts, tomatoes);
        addProduct(listOfProducts, bananas);
        //addProducts(listOfProducts, apples2);
        System.out.println(listOfProducts.toString());
        markPurchase(apples);
        markPurchase(bananas);
        System.out.println(listOfProducts.toString());
        delProduct(listOfProducts, tomatoes);
        System.out.println(listOfProducts.toString());
    }

    public static void addProduct(Set<Product> listOfProducts, Product product) {

        if (!listOfProducts.add(product)) {
            throw new RuntimeException("Продукт с таким именнем уже есть в списке!");
        }

    }

    public static void delProduct(Set<Product> listOfProducts, Product product) {

        if (listOfProducts.remove(product)) {
            System.out.println("Продукт - /*" + product.getName() + "*/ удален из списка покупок");
        }
    }

    public static void markPurchase(Product product) {
        product.setPurchased(true);
    }
}
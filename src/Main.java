import java.util.*;

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

        // Урок 7. Домашние задания
        System.out.println();
        System.out.println("Урок 7. Домашнее задание №1. Блок 2");

        Set<Recipe> listOfRecipes = new HashSet<>();
        Recipe borch = new Recipe("Борщ");
        borch.addProducts(listOfProducts);
        borch.calculateRecipePrice();
        System.out.println(borch);

        Recipe shi = new Recipe("Щи");
        shi.addProducts(listOfProducts);
        shi.calculateRecipePrice();
        System.out.println(shi);

        // Урок 7. Домашние задания
        System.out.println();
        System.out.println("Урок 7. Домашнее задание №2. Блок 2");

        List<Integer> listOfValue = new ArrayList<>(20);
        while (listOfValue.size() < 20) {
            listOfValue.add((int) (Math.random() * 1000));
        }
        System.out.println(listOfValue);
//      вариант №1
//        List<Integer> listOfValueDelete = new ArrayList<>();
//        for (int value: listOfValue) {
//            if (!(value % 2 == 0)) {
//                listOfValueDelete.add(value);
//                //System.out.println(listOfValue.indexOf(value));
//            }
//        }
//        System.out.println(listOfValueDelete);
//        listOfValue.removeAll(listOfValueDelete);
//        System.out.println(listOfValue)
//      вариант №2
        Iterator<Integer> listOfValueIterator= listOfValue.iterator();
        while (listOfValueIterator.hasNext()) {
            if (!(listOfValueIterator.next() % 2 == 0)) {
                listOfValueIterator.remove();
            }
        }
        System.out.println(listOfValue);
    }

    public static void addProduct(Set<Product> listOfProducts, Product product) {

        if (!listOfProducts.add(product)) {
            throw new RuntimeException("Продукт с таким именнем уже есть в списке!");
        }

    }

    public static void addRecipe(Set<Recipe> listOfRecipes, Recipe recipe) {
        if (!listOfRecipes.add(recipe)) {
            throw new RuntimeException("Рецепт с таким именнем уже есть в списке!");
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
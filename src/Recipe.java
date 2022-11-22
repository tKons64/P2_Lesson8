import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Recipe {

    private String titleRecipe;

    private List<Product> products = new ArrayList();

    private double recipePrice;

    public Recipe(String titleRecipe) {
        this.titleRecipe = titleRecipe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return titleRecipe.equals(recipe.titleRecipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleRecipe);
    }

    public String getTitleRecipe() {
        return titleRecipe;
    }

    public void setTitleRecipe(String titleRecipe) {
        this.titleRecipe = titleRecipe;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProducts(Set<Product> listProducts) {
        for (Product product: listProducts) {
            this.products.add(product);
        }
    }

    public double getRecipePrice() {
        return recipePrice;
    }

    public void calculateRecipePrice() {
        double sum = 0;
        for (Product product: products) {
            sum = sum + product.getPrice();
        }
        this.recipePrice = sum;
    }

    @Override
    public String toString() {
        return "Рецепт: " + titleRecipe +
                ", состав продуктов: " + products.toString() +
                ", стоимость:" + recipePrice;
    }
}

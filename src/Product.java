import java.util.Objects;

public class Product {

    private final String name;
    private final double price;
    private final float quantity;

    private boolean purchased;

    public Product(String name, double price, float quantity) {
        this.name = name;
        if (price == 0 || quantity == 0f) {
            throw new RuntimeException("Заполните карточку товара полностью");
        } else {
            this.price = price;
            this.quantity = quantity;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name + " (цена:" + getPrice() + " руб., кол.: " + getQuantity() + " кг.) - " + (isPurchased()? "":"не ") + "куплен";
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public float getQuantity() {
        return quantity;
    }

    public boolean isPurchased() {
        return purchased;
    }

    public void setPurchased(boolean purchased) {
        this.purchased = purchased;
    }
}

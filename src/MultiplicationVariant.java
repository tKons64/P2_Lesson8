import java.util.Objects;

public class MultiplicationVariant {

    private String representation;
    private int multiplied;
    private int factor;
    private int result;

    public MultiplicationVariant(String representation, int multiplied, int factor) {
        this.representation = representation;
        this.multiplied = multiplied;
        this.factor = factor;
        this.result = multiplied * factor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MultiplicationVariant that = (MultiplicationVariant) o;
        return result == that.result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(result);
    }

    @Override
    public String toString() {
        return representation;
    }
}

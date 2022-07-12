import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class NumberDivisors {

    private int value;
    private List<Integer> divisors;

    private void count(){
        divisors = new LinkedList<>();
        for (int i = 1; i <= value; i++) {
            if (value % i == 0) divisors.add(i);
        }
    }

    public NumberDivisors(int value) {
        this.value = value;
        this.count();
    }

    public int getValue() {
        return value;
    }

    public List<Integer> getDivisors() {
        return divisors;
    }

    public void setValue(int value) {
        this.value = value;
        this.count();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumberDivisors that = (NumberDivisors) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, divisors);
    }

    @Override
    public String toString() {
        return "NumberDivisors{" +
                "value=" + value +
                ", divisors=" + divisors +
                '}';
    }
}

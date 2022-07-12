import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class NumberDividers {

    private int value;
    private List<Integer> dividers;

    private void count(){
        dividers = new LinkedList<>();
        for (int i = 1; i <= value; i++) {
            if (value % i == 0) dividers.add(i);
        }
    }

    public NumberDividers(int value) {
        this.value = value;
        this.count();
    }

    public int getValue() {
        return value;
    }

    public List<Integer> getDividers() {
        return dividers;
    }

    public void setValue(int value) {
        this.value = value;
        this.count();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumberDividers that = (NumberDividers) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, dividers);
    }

    @Override
    public String toString() {
        return "NumberDividers{" +
                "value=" + value +
                ", dividers=" + dividers +
                '}';
    }
}

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class NumberDivisorsTest {

    @Test
    public void check_if_divisors_of_zero_is_empty(){
        NumberDivisors numberDivisors = new NumberDivisors(0);
        Assert.assertTrue(numberDivisors.getDivisors().isEmpty());
    }

    @Test
    public void check_if_divisors_of_8639_are_correct(){
        NumberDivisors numberDivisors = new NumberDivisors(8639);
        Assert.assertArrayEquals(numberDivisors.getDivisors().toArray(), Arrays.asList(1, 53, 163, 8639).toArray());
    }

    @Test
    public void check_if_changing_value_changes_divisors(){
        NumberDivisors numberDivisors = new NumberDivisors(8639);
        numberDivisors.setValue(10);
        Assert.assertArrayEquals(numberDivisors.getDivisors().toArray(),new Integer[]{1,2,5,10});
    }
}

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class RandomTest {

    @Test
    public void randomTest() {
        Random random = new Random();
        int randomValue = random.nextInt(10);
        Assert.assertTrue(randomValue >= 1);
        Assert.assertTrue(randomValue <= 10);

    }
}

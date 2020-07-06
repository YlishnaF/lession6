import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;



@RunWith(Parameterized.class)
public class ClassForTest {
    private int[] arr;
    private boolean b;

    public ClassForTest(int[] arr, boolean b) {
        this.arr = arr;
        this.b = b;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> oneFour() {
        return Arrays.asList(new Object[][]{
                {new int[]{ 1,1,1,4,4,1,4,4}, true},
                {new int[]{1,1,1,1}, false},
                {new int[]{1, 4, 8, 4}, false},
                {new int[]{4, 4, 4, 4}, false}
        });
    }


    @Test
    public void arrOneFour() {
        Main main = new Main();
        Assert.assertEquals(main.onrAndFour(arr), b);
    }



}




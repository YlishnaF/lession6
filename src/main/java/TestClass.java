import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;



@RunWith(Parameterized.class)
public class TestClass {
    private int[] arr;
    private int[] newArr;



    public TestClass(int[] arr, int[] newArr) {
        this.arr = arr;
        this.newArr = newArr;
    }
    @Parameterized.Parameters
    public static Collection<Object[]> afterFour() {
        return Arrays.asList(new Object[][]{
                {new int[]{4,3,7,5,9,4,6}, new int[]{6}},
                {new int[]{2,4,5,4,6,7}, new int[]{6,7}},
                {new int[]{1, 3, 8, 4}, new int[]{}}


        });
    }


    @Test
    public void arrFour() {
        Main main = new Main();
        Assert.assertArrayEquals(main.arrayAfterFour(arr), newArr);
    }


}



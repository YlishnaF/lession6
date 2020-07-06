import org.junit.*;



public class Tested {
    private static Main main;

    @BeforeClass
    public static void init(){
        main = new Main();
        System.out.println("init()");
    }

    @Test
    public void testAdd1(){

        Assert.assertArrayEquals(main.arrayAfterFour(new int[]{1,3,5,4,5}), new int []{5});
    }
    @Test
    public void testAdd2(){

        Assert.assertArrayEquals(main.arrayAfterFour(new int[]{1,4,5,4,5,7}), new int []{5,7});
    }

//    @Test(expected = RuntimeException.class)
//    public void testAdd3(){
//
//        main.arrayAfterFour(new int[]{1,3,5,2,5,7});
//    }

}

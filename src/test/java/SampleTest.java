import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.IAssert;

public class SampleTest {
    @Test
    public  void testPrint() {
        System.out.println("test first time");
        Assert.assertTrue(5==5);

    }   @Test
    public  void testType() {
        System.out.println("test First time");
        Assert.assertTrue(20 == 5);


    }

    @Test
    public  void testFalse() {
        System.out.println("Testing False");
        Assert.assertFalse(5 > 8);
    }



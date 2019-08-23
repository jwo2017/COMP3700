import org.junit.Assert;
import org.junit.Test;

public class FinderTest {
    @Test
    public void test_findMax() {
        Finder testFinder = new Finder();
        int[] arr = {1, 5, 6, 7, 2, 3, 34, 5, 6, 234, 6, 3, 3};
        int result = testFinder.findMax(arr);
        Assert.assertEquals(result, 234);
    }

    @Test
    public void test_findMin() {
        Finder testFinder = new Finder();
        int[] arr = {5, 6, 7, 2, 3, 34, 1, 5, 6, 234, 6, 3, 3};
        int result = testFinder.findMin(arr);
        Assert.assertEquals(result, 1);
    }

    @Test
    public void test_findMaxNull() {
        Finder testFinder = new Finder();
        int[] arr = null;
        Integer result = testFinder.findMax(arr);
        Assert.assertNull(result);
    }

    @Test
    public void test_findMinNull() {
        Finder testFinder = new Finder();
        int[] arr = null;
        Integer result = testFinder.findMin(arr);
        Assert.assertNull(result);
    }

    @Test
    public void test_findMaxEmpty() {
        Finder testFinder = new Finder();
        int[] arr = {};
        Integer result = testFinder.findMax(arr);
        Assert.assertNull(result);
    }

    @Test
    public void test_findMinEmpty() {
        Finder testFinder = new Finder();
        int[] arr = {};
        Integer result = testFinder.findMin(arr);
        Assert.assertNull(result);

    }

}

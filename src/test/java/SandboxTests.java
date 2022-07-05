import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SandboxTests {
    Sandbox box;

    @Before
    public void init(){
        box = new Sandbox();
    }
    @Test
    public void test01(){
        int[] nums =  {1,2,5,56,7,4,3,3,4,3,2};
        int remove = 3;

        int result = box.distinctIds(nums,  remove);
        Assert.assertEquals(4, result);
    }

    @Test
    public void test02(){
        int nums[] = {1,2,3,4,5,6,7,8,9,0,10,1,2,3,4,5};
        int remove = 6;

        int result = box.distinctIds(nums,  remove);
        Assert.assertEquals(5, result);
    }

    @Test
    public void test03(){
        int[] nums =  {1,2,5,56,7,4,3,3,4,3,2};
        int remove = 3;

        int result = box.distinctIds(nums,  remove);
        Assert.assertEquals(4, result);
    }

    @Test
    public void test04(){
        int[] nums =  {2,8 ,8,8,8,5,33,2,4,6 ,6,45,2,13,64,67,10, 10, 10, 30, 30, 30, 1,2,3,101,102,103};
        int remove = 8;

        int result = box.distinctIds(nums,  remove);
        Assert.assertEquals(9, result);
    }
}

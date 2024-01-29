import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(Parameterized.class)
public class TestLionForDoesHaveMane {
    private String sex;
    private boolean hasMame;

    public TestLionForDoesHaveMane(String sex, boolean hasMane){
        this.sex = sex;
        this.hasMame = hasMane;

    }
    @Parameterized.Parameters
    public static Object[][] dataForDoesHaveManeTest(){
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},

        };
    }


    @Test
    public void doesHaveManeTest() throws Exception{
        Feline feline = Mockito.mock(Feline.class);
        Lion lion = new Lion(sex, feline);
        Assert.assertEquals(hasMame, lion.doesHaveMane());

    }

}

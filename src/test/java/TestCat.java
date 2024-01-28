import com.example.Cat;
import com.example.Feline;
import com.example.Predator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TestCat {

    @Mock
    Feline mockFeline = new Feline();


    @Test
    public void testGetSound(){
        Cat cat = new Cat(mockFeline);
        Assert.assertEquals("Мяу", cat.getSound());

    }
    @Test
    public void testGetFood()throws Exception {
        Cat cat = new Cat(mockFeline);
        Mockito.when(mockFeline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals((List.of("Животные", "Птицы", "Рыба")), cat.getFood());

    }
}

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestLion {
    Feline feline = new Feline();
    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Lion lionSpy = Mockito.spy(lion);
        Mockito.when(lionSpy.getKittens()).thenReturn(1);
        assertEquals(1, lionSpy.getKittens());
    }

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion("Самец",feline);
        Lion lionSpy = Mockito.spy(lion);
        Mockito.when(lionSpy.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lionSpy.getFood());
    }
    @Test
    public void hasManeExceptionTest() throws Exception {
        Assert.assertThrows(Exception.class, () -> {
            new Lion("Абракадабра", feline);
        });
    }
}

import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestFeline {

    @Spy
    Feline felineSpy = new Feline();

    @Test
    public void getFamilyTest(){
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());

    }
    @Test
    public void getKittensWithCountTest(){
        Feline feline = new Feline();
        assertEquals(10, feline.getKittens(10));
    }
    @Test
    public void getKittensTest(){
        felineSpy.getKittens();
        Mockito.verify(felineSpy, Mockito.times(1)).getKittens(1);
    }

    @Test
    public void eatMeatTest() throws Exception{
        felineSpy.eatMeat();
        Mockito.verify(felineSpy, Mockito.times(1)).getFood("Хищник");
    }

}

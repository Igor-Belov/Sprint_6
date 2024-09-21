import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getSound_Meow() {
        Cat cat = new Cat(feline);
        String expectedSoundMeow = "Мяу";
        Assert.assertEquals("Ожидаем другой звук от кошки", expectedSoundMeow, cat.getSound());
    }

    @Test
    public void getFood_predator() throws Exception {
        Cat cat = new Cat(feline);
        cat.getFood();
        verify(feline, times(1)).eatMeat();
    }
}
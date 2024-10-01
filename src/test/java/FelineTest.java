import com.example.Feline;
import com.example.Animal;
import com.example.Predator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    Feline extendsAnimal;

    @Test
    public void eatMeatSuccess() throws Exception {
        extendsAnimal.eatMeat();
        verify(extendsAnimal, times(1)).getFood("Хищник");
    }

    @Test
    public void getFamilyFeline() {
        String exceptionFeline = "Кошачьи";
        Feline feline = new Feline();
        assertEquals("Ожидаем семейство кашачьи", exceptionFeline, feline.getFamily());
    }

    @Test
    public void getKittensOne() {
        int exceptionKittensCount = 1;
        Feline feline = new Feline();
        assertEquals("Ожидаем одного котенка", exceptionKittensCount, feline.getKittens());
    }

    @Test
    public void getKittensMoreOne() {
        int exceptionKittensCount = 5;
        Feline feline = new Feline();
        assertEquals("Ожидаем пять котят", exceptionKittensCount, feline.getKittens(5));
    }
}
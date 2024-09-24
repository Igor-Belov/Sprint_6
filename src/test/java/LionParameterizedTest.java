import com.example.Feline;
import com.example.Lion;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

@RunWith(Parameterized.class)
public class LionParameterizedTest {
    String sex;
    boolean hasMane;

    public LionParameterizedTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Rule
    public MockitoRule mockito = MockitoJUnit.rule();

    @Mock
    Feline feline;

    //тестовые данные для проверки ветвления условий по полу
    @Parameterized.Parameters(name = "Пол: {0}")
    public static Object[][] getData() {
        return new Object[][]{
                {/*имя*/"Самец", /*есть грива*/ true},
                {/*имя*/"Самка", /*есть грива*/ false}
        };
    }

    @Test
    public void doesHaveManeSuccess() throws Exception {
        Lion lion = new Lion(sex, feline);
        Assert.assertEquals(hasMane, lion.doesHaveMane());
    }
}
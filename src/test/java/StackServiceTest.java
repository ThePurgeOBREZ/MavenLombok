import org.junit.Before;
import org.junit.Test;
import stack.StackService;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

//Selenium web browser
//Mockito
//JUnit (!!посмотреть первыен ролики на ютуб)
//как создать собственный есепшен в гугл (скиньте мне все в своем собственном репозитории (maven проект!))
public class StackServiceTest {

    private StackService stackService;

    @Before
    public void init() {
        stackService = new StackService();
    }

    @Test
    public void correctInitialStringTest() throws IOException {
        String correctStatement = "(({{}}))";
        assertEquals(true,
                stackService.isStatementCorrect(correctStatement));
    }

    @Test
    public void incorrectInitialStringTest() throws IOException {
        String correctStatement = "(({{((())((((}}))";
        assertEquals(false,
                stackService.isStatementCorrect(correctStatement));
    }
    @Test
    public void nullInitialStringTest() throws IOException {
        String correctStatement = "";
        assertEquals(true,
                stackService.isStatementCorrect(correctStatement));
    }
}

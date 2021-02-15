import org.junit.Before;
import org.junit.Test;
import stack.StackService;

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
    public void correctInitialStringTest() {
        String correctStatement = "(({{}}))";
        assertEquals(true,
                stackService.isStatementCorrect(correctStatement));
    }

    @Test
    public void incorrectInitialStringTest() {
        String correctStatement = "(({{((())((((}}))";
        assertEquals(false,
                stackService.isStatementCorrect(correctStatement));
    }
}
